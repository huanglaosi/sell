package com.imooc.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    OrderStatusEnum(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }

    private Integer code;

    private  String massage;

}
