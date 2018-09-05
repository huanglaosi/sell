package com.imooc.service.impl;

import com.imooc.dao.ProductCategoryRepository;
import com.imooc.dataobject.ProductCatagory;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCatagory findOne(Integer categoryId) {

        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCatagory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCatagory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCatagory save(ProductCatagory productCatagory) {
        return repository.save(productCatagory);
    }
}
