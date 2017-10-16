/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.user.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.user.entity.RpUserInfo;

/**
 * @类功能说明： 用户dao
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpUserInfoDao  extends BaseDao<RpUserInfo> {
	
	/** 获取用户编号 **/
	String buildUserNo();
	
	/** 获取账户编号 **/
	String buildAccountNo();
}