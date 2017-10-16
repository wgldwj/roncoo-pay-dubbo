/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.user.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.user.entity.RpUserPayInfo;

/**
 * @类功能说明： 用户第三方支付信息dao
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpUserPayInfoDao  extends BaseDao<RpUserPayInfo> {

    /**
     * 通过商户编号获取商户第三方支付信息
     * @param userNo
     * @param payWayCode
     * @return
     */
    public  RpUserPayInfo getByUserNo(String userNo, String payWayCode);

}