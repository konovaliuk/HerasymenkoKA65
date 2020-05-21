package repository.contracts;

import repository.entities.ActivityItems;
import repository.entities.User;

import java.util.List;

public interface IActivityItems {
    List<ActivityItems> getActivitiesByUser(User user);
}
