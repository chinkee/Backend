package com.niit.backend.DAO;



import java.util.List;

import com.niit.backend.model.Product;

public interface ProductDAO {

    public void save(Product product);
    
    public void update(Product product);
    
    public void delete(int productId);
    
    public Product getById(int productId);
    
    public List<Product> list();
    
}