
package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Cart;

@Repository
public class CartDAOImpl implements CartDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    public void save(Cart cart) {
    Session session = sessionFactory.getCurrentSession();
    session.save(cart);
    }

    public void update(Cart cart) {
        Session session = sessionFactory.getCurrentSession();
        session.update(cart);

    }

    public void delete(int cartId) {
        Cart cartToDelete = new Cart();
        cartToDelete.setCartId(cartId);
        sessionFactory.getCurrentSession().delete(cartToDelete);

    }

    public Cart getById(int cartId) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from Cart where cartId = '"+ cartId+"'";
        Query query = session.createQuery(hql);
        List<Cart> carts = query.list();
        if(carts != null && !carts.isEmpty()){
            return carts.get(0);
        }
        
        return null;
    }

    public List<Cart> list() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Cart");
        List<Cart> carts = query.list();
        return carts;
    }

}