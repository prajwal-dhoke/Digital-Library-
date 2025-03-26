package com.application.courseLibrary.service;

import com.application.courseLibrary.entity.Book;
import com.application.courseLibrary.entity.Category;
import com.application.courseLibrary.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> findAllCategories(){
		return categoryRepository.findAll();
	}

	public Category findCategoryById(Long id){
		Category category=categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
		return category;
	}

	public void createCategory(Category category){
		categoryRepository.save(category);
	}

	public void updateCategory(Category category){
		categoryRepository.save(category);
	}

	public void deleteCategoryById(Long id){
		Category category=categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Author not found"));
		categoryRepository.deleteById(category.getId());
	}
	public void deleteCategory(Long id){
		Category category;
		category=categoryRepository.findById(id).orElseThrow(()->new RuntimeException("category not found"));
		categoryRepository.deleteById(category.getId());

	}
}
