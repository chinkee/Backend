
package com.niit.backend.Service;

import java.util.List;

import com.niit.backend.model.Cart;

public interface CartService {
public void save(Cart category);
    
    public void update(Cart cart);
    
    public void delete(int cartId);
    
    public Cart getById(int cartId);
    
    public List<Cart> list();
    
}