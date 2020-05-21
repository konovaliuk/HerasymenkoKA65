package repository.impplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.ITimesheetRepository;
import repository.contracts.ITimesheet;
import repository.entities.Timesheet;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository("TimesheetService")
@Transactional
public class TimesheetImpl implements ITimesheet {
    @Autowired
    private ITimesheetRepository timesheetRepository;
    @Override
    public Iterable<Timesheet> findAll() {
        return timesheetRepository.findAll();
    }

    @Override
    public Optional<Timesheet> findById(Integer timesheetid) {
        return timesheetRepository.findById(timesheetid);
    }

    @Override
    public void submitTimesheet(Timesheet timesheet) {
        timesheetRepository.submitTimesheet(timesheet);
    }
}
