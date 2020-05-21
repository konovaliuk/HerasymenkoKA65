package com.timetracking.app;

import org.springframework.stereotype.Service;
import repository.contracts.IActivityItems;
import repository.contracts.IUser;
import repository.entities.ActivityItems;
import repository.entities.User;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TimeTrackingService {
    private final IActivityItems activityItems;
    private final IUser userInstance;

    public TimeTrackingService(IActivityItems activityItem, IUser userInstance) {
        this.activityItems = activityItem;
        this.userInstance = userInstance;
    }

    @Transactional
    public List<ActivityItems> getActivityItemsList(User user){
        return activityItems.getActivitiesByUser(user);
    }
    @Transactional
    public void SubmitTisheetForParticularUser(User user){
        userInstance.saveUserData(user);
    }

}
