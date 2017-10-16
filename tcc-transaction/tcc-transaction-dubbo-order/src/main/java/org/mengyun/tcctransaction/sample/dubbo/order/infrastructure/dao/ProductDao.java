package org.mengyun.tcctransaction.sample.dubbo.order.infrastructure.dao;

import org.mengyun.tcctransaction.sample.dubbo.order.domain.entity.Product;

import java.util.List;

/**
 * Created by  on 16/11/10.
 */
public interface ProductDao {

    Product findById(long productId);

    List<Product> findByShopId(long shopId);
}