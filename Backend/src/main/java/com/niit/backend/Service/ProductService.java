package com.niit.backend.Service;

import java.util.List;

import com.niit.backend.model.Product;

public interface ProductService {
public void save(Product product);
    
    public void update(Product product);
    
    public void delete(int productId);
    
    public Product getById(int productId);
    
    public List<Product> list();
    
}