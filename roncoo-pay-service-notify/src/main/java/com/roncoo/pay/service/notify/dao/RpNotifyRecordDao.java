/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.notify.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.notify.entity.RpNotifyRecord;

/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/6/2  上午11:20
 *
 * @版本:V1.0
 */
public interface RpNotifyRecordDao  extends BaseDao<RpNotifyRecord> {

    RpNotifyRecord getNotifyByMerchantNoAndMerchantOrderNoAndNotifyType(String merchantNo, String merchantOrderNo, String notifyType);

    int deleteByPrimaryKey(String id);

    RpNotifyRecord selectByPrimaryKey(String id);

    int updateByPrimaryKey(RpNotifyRecord record);
}