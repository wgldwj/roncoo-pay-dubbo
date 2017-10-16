/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.dao;

import java.util.Map;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.account.entity.RpAccount;

/**
 * @类功能说明： 账户dao
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpAccountDao  extends BaseDao<RpAccount> {
	RpAccount getByAccountNo(String accountNo);

	RpAccount getByUserNo(Map<String, Object> map);
}