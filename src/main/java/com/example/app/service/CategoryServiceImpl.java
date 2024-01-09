package com.example.app.service;

import com.example.app.entity.Category;
import com.example.app.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories=categoryRepository.findAll();
        return categories;
    }
}
