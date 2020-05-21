package repository.contracts;

import repository.entities.Timesheet;

import java.util.Optional;

public interface ITimesheet {
    Iterable<Timesheet> findAll();
    Optional<Timesheet> findById(Integer timesheetid);
    void submitTimesheet(Timesheet timesheet);
}
