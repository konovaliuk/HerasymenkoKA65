package controllers;

import com.timetracking.app.TimeTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import repository.entities.ActivityItems;
import repository.entities.User;

import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private final TimeTrackingService serviceInstance;
    @Autowired
    public HomeController(TimeTrackingService serviceInstance) {
        this.serviceInstance = serviceInstance;
    }
    @GetMapping(value = "getInfo")
    public void GetInforPerUser(User user){
        ShowDataaBaseInformationOnUI(serviceInstance.getActivityItemsList(user));
    }
    ModelAndView ShowDataaBaseInformationOnUI(List<ActivityItems> activitiesList){
        ModelAndView viewModel = new ModelAndView();
        viewModel.setViewName("homePage");
        for(ActivityItems item : activitiesList) {
            viewModel.addObject(item);
        }
        return viewModel;
    }

}