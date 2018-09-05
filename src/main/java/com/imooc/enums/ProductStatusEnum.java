package com.imooc.enums;

import lombok.Getter;

import javax.persistence.GeneratedValue;

@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private  String massage;

    ProductStatusEnum(Integer code,String massage){
        this.code=code;
        this.massage=massage;
    }

}
