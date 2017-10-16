/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.user.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.roncoo.pay.common.core.dao.impl.BaseDaoImpl;
import com.roncoo.pay.service.user.dao.RpUserPayInfoDao;
import com.roncoo.pay.service.user.entity.RpUserPayInfo;


/**
 * @类功能说明： 用户第三方支付信息dao实现类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
@Repository
public class RpUserPayInfoDaoImpl  extends BaseDaoImpl<RpUserPayInfo> implements RpUserPayInfoDao{
    /**
     * 通过商户编号获取商户第三方支付信息
     *
     * @param userNo
     * @param payWayCode
     * @return
     */
    @Override
    public RpUserPayInfo getByUserNo(String userNo, String payWayCode) {
        Map<String , Object> paramMap = new HashMap<String , Object>();
        paramMap.put("userNo",userNo);
        paramMap.put("payWayCode",payWayCode);
        return super.getBy(paramMap);
    }
}