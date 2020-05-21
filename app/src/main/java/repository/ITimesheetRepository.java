package repository;

import org.springframework.data.repository.CrudRepository;
import repository.entities.Timesheet;

import java.util.List;
import java.util.Optional;

public interface ITimesheetRepository extends CrudRepository<Timesheet, Integer> {
    List<Timesheet> findAll();
    Optional<Timesheet> findById(Integer timesheetid);
    void submitTimesheet(Timesheet timesheet);
}
