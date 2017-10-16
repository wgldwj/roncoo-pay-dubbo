/*
 * ====
 * 陈德元：



 * ====
 */
package org.mengyun.tcctransaction.sample.dubbo.redpacket.infrastructure.dao;

import org.mengyun.tcctransaction.sample.dubbo.redpacket.domain.entity.RedPacketAccount;

/**
 * Created by  on 4/2/16.
 */
public interface RedPacketAccountDao {

    RedPacketAccount findByUserId(long userId);

    void update(RedPacketAccount redPacketAccount);
}
