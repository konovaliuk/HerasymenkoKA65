package repository.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="Timesheet")
public class Timesheet {
    @Id
    @Column (name="ID")
    private Integer id;
    @Column(name="WeekStartDate")
    private Date weekStartDate;
    @Column(name = "TotalHours")
    private double totalHours;
    @OneToMany(mappedBy = "timesheet")
    private List<ActivityItems> activityItems;
    public Date getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Date weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }


}
