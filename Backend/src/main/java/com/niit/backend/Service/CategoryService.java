package com.niit.backend.Service;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryService {
public void save(Category category);
    
    public void update(Category category);
    
    public void delete(int categoryId);
    
    public Category getById(int categoryId);
    
    public List<Category> list();
    
}