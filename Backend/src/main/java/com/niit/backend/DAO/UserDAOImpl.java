
package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(User user) {
    Session session = sessionFactory.getCurrentSession();
    session.save(user);
    }

    public void update(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);

    }

    public void delete(int userId) {
        User userToDelete = new User();
        userToDelete.setUserId(userId);
        sessionFactory.getCurrentSession().delete(userToDelete);

    }

    public User getById(int userId) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from User where userId = '"+ userId+"'";
        Query query = session.createQuery(hql);
        List<User> users = query.list();
        if(users != null && !users.isEmpty()){
            return users.get(0);
        }
        
        return null;
    }

    public List<User> list() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from User");
        List<User> users = query.list();
        return users;
    }

}