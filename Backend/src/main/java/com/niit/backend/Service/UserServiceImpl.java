package com.niit.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.UserDAO;
import com.niit.backend.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    
    public void save(User user) {
        
        userDAO.save(user);
    }

    public void update(User user) {
        // TODO Auto-generated method stub

    }

    public void delete(int categoryId) {
        // TODO Auto-generated method stub

    }

    public User getById(int userId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<User> list() {
        // TODO Auto-generated method stub
        return null;
    }

}