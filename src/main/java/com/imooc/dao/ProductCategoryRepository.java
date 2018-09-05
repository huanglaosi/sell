package com.imooc.dao;

import com.imooc.dataobject.ProductCatagory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//dao层代码
public interface ProductCategoryRepository extends JpaRepository<ProductCatagory,Integer> {

    List<ProductCatagory> findByCategoryTypeIn(List<Integer> categoryTypeList);




}
