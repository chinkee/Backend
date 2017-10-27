package com.niit.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.ProductDAO;
import com.niit.backend.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;
    
    public void save(Product product) {
        
        productDAO.save(product);
    }

    public void update(Product product) {
        // TODO Auto-generated method stub

    }

    public void delete(int productId) {
        // TODO Auto-generated method stub

    }

    public Product getById(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<Product> list() {
        // TODO Auto-generated method stub
        return null;
    }

}