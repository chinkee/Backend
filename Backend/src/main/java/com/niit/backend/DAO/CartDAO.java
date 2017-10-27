
package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Cart;

public interface CartDAO {

    public void save(Cart cart);
    
    public void update(Cart cart);
    
    public void delete(int cartId);
    
    public Cart getById(int cartId);
    
    public List<Cart> list();
    
}