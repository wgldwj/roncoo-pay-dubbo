/*
 *
 * 陈德元：
 * 超级教程系列：《微服务架构的 分布式事务 解决方案》视频教程


 *
 */
package org.mengyun.tcctransaction.sample.dubbo.capital.infrastructure.dao;

import org.mengyun.tcctransaction.sample.dubbo.capital.domain.entity.CapitalAccount;

/**
 * Created by  on 4/2/16.
 */
public interface CapitalAccountDao {

    CapitalAccount findByUserId(long userId);

    void update(CapitalAccount capitalAccount);
}
