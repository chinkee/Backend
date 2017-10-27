package com.niit.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.CategoryDAO;
import com.niit.backend.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;
    
    public void save(Category category) {
        
        categoryDAO.save(category);
    }

    public void update(Category category) {
    	 categoryDAO.update(category);

    }

    public void delete(int categoryId) {
    	 categoryDAO.delete(categoryId);

    }

    public Category getById(int categoryId) {
    	 categoryDAO.getById(categoryId);
        return null;
    }

    public List<Category> list() {
        // TODO Auto-generated method stub
        return null;
    }

}