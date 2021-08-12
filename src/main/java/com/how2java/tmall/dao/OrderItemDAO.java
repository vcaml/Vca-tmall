package com.how2java.tmall.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;
import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    //这种方式在命名里提供OrderByIdDesc，就进行到排序了，就可以不用传Sort参数了。
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
}
