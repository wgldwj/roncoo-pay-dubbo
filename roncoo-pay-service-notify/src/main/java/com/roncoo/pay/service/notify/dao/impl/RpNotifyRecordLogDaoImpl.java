/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.notify.dao.impl;

import org.springframework.stereotype.Repository;

import com.roncoo.pay.common.core.dao.impl.BaseDaoImpl;
import com.roncoo.pay.service.notify.dao.RpNotifyRecordLogDao;
import com.roncoo.pay.service.notify.entity.RpNotifyRecordLog;

/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/6/2  下午2:32
 *
 * @版本:V1.0
 */
@Repository("rpNotifyRecordLogDao")
public class RpNotifyRecordLogDaoImpl extends BaseDaoImpl<RpNotifyRecordLog> implements RpNotifyRecordLogDao {
    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public RpNotifyRecordLog selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(RpNotifyRecordLog record) {
        return 0;
    }
}
