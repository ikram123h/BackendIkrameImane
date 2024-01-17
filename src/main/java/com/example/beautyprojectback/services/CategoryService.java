package com.example.beautyprojectback.services;


import com.example.beautyprojectback.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    Category saveCategory(Category category);
    Category UpdateCategory(Category category);
    Category getCategory(Long id);
    List<Category> getAllCategories();
    void deleteCategoryById(Long id);
    void deleteAllCategories();
}

