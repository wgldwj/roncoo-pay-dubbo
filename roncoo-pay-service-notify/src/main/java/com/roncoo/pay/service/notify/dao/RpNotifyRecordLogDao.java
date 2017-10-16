/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.notify.dao;


import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.notify.entity.RpNotifyRecordLog;


/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/6/2  上午11:20
 *
 * @版本:V1.0
 */
public interface RpNotifyRecordLogDao  extends BaseDao<RpNotifyRecordLog> {


    int deleteByPrimaryKey(String id);

    RpNotifyRecordLog selectByPrimaryKey(String id);

    int updateByPrimaryKey(RpNotifyRecordLog record);
}