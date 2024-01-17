package com.example.beautyprojectback.services;


import com.example.beautyprojectback.entities.Category;
import com.example.beautyprojectback.repositories.CategoryReposirotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;





@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryReposirotory categoryRepository;
    @Override
    public Category saveCategory(Category category) { return categoryRepository.save(category); }

    @Override
    public Category UpdateCategory(Category category) { return categoryRepository.save(category); }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);

    }

    @Override
    public void deleteAllCategories() {
        categoryRepository.deleteAll();
    }
}
