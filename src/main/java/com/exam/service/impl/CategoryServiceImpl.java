package com.exam.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.exam.Category;
import com.exam.repo.CategoryRepository;
import com.exam.service.CategoryService;




@Service
public class CategoryServiceImpl implements CategoryService{
	
	//For Functionality we need repository 
	@Autowired
	private CategoryRepository categoryRepository;
	

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		// If i want to add so i will return the repository
		//Save work like if i give the old id then it will update
		return this.categoryRepository.save(category);
	}

	@Override
	public Category udateCategory(Category category) {
		// TODO Auto-generated method stub
		return this.categoryRepository.save(category);
	}

	@Override
	public Set<Category> getCategories() {
		// TODO Auto-generated method stub
		
		//In this we are giving the Getting set but it will take list so we are giving in return LinkedHashSet 
		
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	@Override
	public Category getCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return this.categoryRepository.findById(categoryId).get();
	}

	@Override
	public void deleteCategory(Long categoryId) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category.setCid(categoryId);
		this.categoryRepository.delete(category);
		
	}

}
