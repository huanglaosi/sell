package com.imooc.service.impl;

import com.imooc.dataobject.ProductCatagory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @Test
    public void findOne() throws Exception {
        ProductCatagory productCatagory=categoryServiceImpl.findOne(1);
        Assert.assertEquals(new Integer(1),productCatagory.getCategoryId());
        System.out.println(productCatagory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCatagory> productCatagoryList= categoryServiceImpl.findAll();
        Assert.assertNotEquals(0,productCatagoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCatagory> productCatagoryList=categoryServiceImpl.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,productCatagoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCatagory productCatagory = new ProductCatagory("男生专享", 10);
        ProductCatagory result = categoryServiceImpl.save(productCatagory);
        Assert.assertNotNull(result);



    }

}