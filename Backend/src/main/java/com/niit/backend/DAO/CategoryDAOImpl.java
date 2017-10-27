
package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(Category category) {
    Session session = sessionFactory.getCurrentSession();
    session.save(category);
    }

    public void update(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.update(category);

    }

    public void delete(int categoryId) {
        Category categoryToDelete = new Category();
        categoryToDelete.setCategoryId(categoryId);
        sessionFactory.getCurrentSession().delete(categoryToDelete);

    }

    public Category getById(int categoryId) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from Category where categoryId = '"+ categoryId+"'";
        Query query = session.createQuery(hql);
        List<Category> categories = query.list();
        if(categories != null && !categories.isEmpty()){
            return categories.get(0);
        }
        
        return null;
    }

    public List<Category> list() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Category");
        List<Category> categories = query.list();
        return categories;
    }

}