package repository.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ActivityItems")
public class ActivityItems implements Serializable {
    @Id
    @Column(name="ID")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID", referencedColumnName = "ID")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TimesheetID", referencedColumnName = "ID")
    private Timesheet timesheet;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timesheet getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }
}