package repository.impplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import repository.IUserRepository;
import repository.contracts.IUser;
import repository.entities.User;

import javax.transaction.Transactional;
import java.util.Optional;
@Repository("UserService")
@Transactional
public class UserImpl implements IUser {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public Iterable<User> getUserById(Integer userId) {
        return userRepository.getUserById(userId);
    }

    @Override
    public Iterable<User> getUserByFullName(String firsttname, String secondName) {
        return userRepository.getUserByFullName(firsttname, secondName);
    }
    @Override
    public void saveUserData(User user) {
        userRepository.save(user);
    }
}
