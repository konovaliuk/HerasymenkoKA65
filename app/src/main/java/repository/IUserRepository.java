package repository;

import org.springframework.data.repository.CrudRepository;
import repository.entities.User;

import java.util.List;

public interface IUserRepository extends CrudRepository<User, Integer> {
    List<User> getAllUsers();
    List<User> getUserById(Integer userId);
    List<User> getUserByFullName(String firsttname, String secondName);
    void saveUserData();
}
