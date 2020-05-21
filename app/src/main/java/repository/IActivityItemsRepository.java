package repository;

import org.springframework.data.repository.CrudRepository;
import repository.entities.ActivityItems;
import repository.entities.User;

import java.util.List;

public interface IActivityItemsRepository extends CrudRepository<ActivityItems, Integer> {
    List<ActivityItems> getActivitiesByUser(User user);
}
