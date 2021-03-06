package springbootapp.dao;


import springbootapp.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    void saveUser(User user);
    User findUserById(Long id);
    void deleteUser(Long id);
}
