/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.user.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.user.entity.RpUserPayConfig;

/**
 * @类功能说明： 用户支付配置dao
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpUserPayConfigDao  extends BaseDao<RpUserPayConfig> {

    /**
     * 根据用户编号获取用户支付信息
     * @param userNo
     * @return
     */
    RpUserPayConfig getByUserNo(String userNo, String auditStatus);

}