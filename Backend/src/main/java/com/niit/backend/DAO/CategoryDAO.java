package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryDAO {

    public void save(Category category);
    
    public void update(Category category);
    
    public void delete(int categoryId);
    
    public Category getById(int categoryId);
    
    public List<Category> list();
    
}