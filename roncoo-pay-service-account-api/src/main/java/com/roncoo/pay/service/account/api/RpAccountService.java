/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.api;

import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.account.entity.RpAccount;
import com.roncoo.pay.service.account.exceptions.AccountBizException;

/**
 * @类功能说明： 账户service接口
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpAccountService{
	
	/**
	 * 保存
	 */
	void saveData(RpAccount rpAccount) throws AccountBizException;

	/**
	 * 更新
	 */
	void updateData(RpAccount rpAccount) throws AccountBizException;

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	RpAccount getDataById(String id) throws AccountBizException;
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, RpAccount rpAccount) throws AccountBizException;
	
}