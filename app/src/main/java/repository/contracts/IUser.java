package repository.contracts;

import repository.entities.User;

import java.util.Optional;

public interface IUser {
    Iterable<User> getAllUsers();
    Iterable<User> getUserById(Integer userId);
    Iterable<User> getUserByFullName(String firsttname, String secondName);
    void saveUserData(User user);
}
