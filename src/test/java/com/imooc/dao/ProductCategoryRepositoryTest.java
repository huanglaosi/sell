package com.imooc.dao;

import com.imooc.dataobject.ProductCatagory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCatagory productCatagory = repository.findOne(1);
        System.out.println(productCatagory.toString());
    }

    @Test
    @Transactional
    //事务回滚
    public void saveTest(){
        ProductCatagory productCatagory=new ProductCatagory("男生最爱",4);
        ProductCatagory result = repository.save(productCatagory);
        Assert.assertNotNull(result);
        //Assert.assertNotEquals(null,result);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list= Arrays.asList(2,3,4);
        List<ProductCatagory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }



}