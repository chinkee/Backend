package com.niit.backend.DAO;



import java.util.List;

import com.niit.backend.model.User;

public interface UserDAO {

    public void save(User user);
    
    public void update(User user);
    
    public void delete(int userId);
    
    public User getById(int userId);
    
    public List<User> list();
    
}