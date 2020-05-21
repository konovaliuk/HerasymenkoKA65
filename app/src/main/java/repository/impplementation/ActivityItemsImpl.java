package repository.impplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IActivityItemsRepository;
import repository.contracts.IActivityItems;
import repository.entities.ActivityItems;
import repository.entities.User;

import javax.transaction.Transactional;
import java.util.List;

@Repository("ActivityItemsService")
@Transactional
public class ActivityItemsImpl implements IActivityItems {

    @Autowired
    private IActivityItemsRepository activityItemsRepository;
    @Override
    public List<ActivityItems> getActivitiesByUser(User user) {
        return activityItemsRepository.getActivitiesByUser(user);
    }
}
