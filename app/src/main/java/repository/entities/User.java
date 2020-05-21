package repository.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name="ID")
    private Integer id;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="SecondName")
    private String secondName;
    @Column(name= "UserType")
    private String userType;

    @OneToMany(mappedBy = "user")
    private List<ActivityItems> activityItems;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
