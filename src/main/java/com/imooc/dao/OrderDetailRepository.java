package com.imooc.dao;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository  extends JpaRepository<OrderDetail,Integer> {

    List<OrderDetail> findByOrderId(String orderId);
}
