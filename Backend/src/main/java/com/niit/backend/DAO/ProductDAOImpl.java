
package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(Product product) {
    Session session = sessionFactory.getCurrentSession();
    session.save(product);
    }

    public void update(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.update(product);

    }

    public void delete(int proId) {
        Product productToDelete = new Product();
        productToDelete.setProId(proId);
        sessionFactory.getCurrentSession().delete(productToDelete);

    }

    public Product getById(int productId) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from Product where productId = '"+ productId+"'";
        Query query = session.createQuery(hql);
        List<Product> products = query.list();
        if(products != null && !products.isEmpty()){
            return products.get(0);
        }
        
        return null;
    }

    public List<Product> list() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> products = query.list();
        return products;
    }
}