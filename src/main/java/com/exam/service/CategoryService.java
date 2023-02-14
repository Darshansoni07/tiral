package com.exam.service;

import java.util.Set;

import com.exam.entity.exam.Category;

public interface CategoryService {
	
	public Category addCategory(Category category);
	
	public Category udateCategory(Category category);
	
	public Set<Category> getCategories();
	
	public Category getCategory(Long categoryId);
	
	public void deleteCategory(Long categoryId);

}
