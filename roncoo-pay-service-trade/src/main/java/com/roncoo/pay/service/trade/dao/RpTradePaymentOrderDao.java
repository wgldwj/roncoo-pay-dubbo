/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.trade.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.trade.entity.RpTradePaymentOrder;

/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/5/18  下午4:57
 *
 * @版本:V1.0
 */
public interface RpTradePaymentOrderDao  extends BaseDao<RpTradePaymentOrder>{

    /**
     * 根据商户编号及商户订单号获取支付订单信息
     * @param merchantNo
     * @param merchantOrderNo
     * @return
     */
    RpTradePaymentOrder selectByMerchantNoAndMerchantOrderNo(String merchantNo, String merchantOrderNo);

    int deleteByPrimaryKey(String id);

    int insertSelective(RpTradePaymentOrder record);

    RpTradePaymentOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RpTradePaymentOrder record);

    int updateByPrimaryKey(RpTradePaymentOrder record);
    
   

}
