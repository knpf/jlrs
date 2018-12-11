package com.knpf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knpf.mapper.CategoryMapper;
import com.knpf.pojo.Category;
import com.knpf.service.CategoryService;
/**
 * 商品管理service
 * @author Administrator
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	@Override
	public Category getItemById(int cid) {
		// TODO Auto-generated method stub
		Category category = categoryMapper.get(cid);
		return category;
	}

}
