package com.knpf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.knpf.pojo.Category;
import com.knpf.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/category/{cid}")
	@ResponseBody
	public Category getItemById(@PathVariable int cid){
		Category category = categoryService.getItemById(cid);
		return category;
	}
	
	@RequestMapping("/test/{cid}")
	public ModelAndView test(@PathVariable("cid") int categoryId){
		ModelAndView mav = new ModelAndView();
		Category category = categoryService.getItemById(categoryId);
		System.out.println(category);
		mav.addObject("category",category);
		mav.setViewName("show");
		return mav;
	}
}
