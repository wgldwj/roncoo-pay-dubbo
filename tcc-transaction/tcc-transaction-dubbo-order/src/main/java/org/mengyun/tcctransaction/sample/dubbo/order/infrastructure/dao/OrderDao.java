/*
 * ====
 * 陈德元：



 * ====
 */
package org.mengyun.tcctransaction.sample.dubbo.order.infrastructure.dao;

import org.mengyun.tcctransaction.sample.dubbo.order.domain.entity.Order;

/**
 * Created by  on 4/1/16.
 */
public interface OrderDao {

    public void insert(Order order);

    public void update(Order order);
    
    Order findByMerchantOrderNo(String merchantOrderNo);
}
