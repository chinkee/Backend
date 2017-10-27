
package com.niit.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.model.Cart;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDAO cartDAO;
    
    public void save(Cart cart) {
        
    	cartDAO.save(cart);
    }

    public void update(Cart cart) {
    	cartDAO.update(cart);

    }

    public void delete(int cartId) {
    	cartDAO.delete(cartId);

    }

    public Cart getById(int cartId) {
    	cartDAO.getById(cartId);
        return null;
    }

    public List<Cart> list() {
        // TODO Auto-generated method stub
        return null;
    }

}