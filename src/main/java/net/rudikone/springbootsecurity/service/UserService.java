package net.rudikone.springbootsecurity.service;

import net.rudikone.springbootsecurity.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User show(Long id);

    public void save(User user);

    public void delete(Long id);

    public User getUserByEmail(String email);
}
