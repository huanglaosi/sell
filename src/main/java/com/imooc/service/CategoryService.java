package com.imooc.service;

import com.imooc.dataobject.ProductCatagory;

import java.util.List;

public interface CategoryService {

    ProductCatagory findOne(Integer categoryId);

    List<ProductCatagory> findAll();

    List<ProductCatagory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCatagory save(ProductCatagory productCatagory);

}
