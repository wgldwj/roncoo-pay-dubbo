/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.api;

import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.account.entity.RpAccountHistory;
import com.roncoo.pay.service.account.exceptions.AccountBizException;

/**
 * @类功能说明： 账户历史service接口
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpAccountHistoryService{
	
	/**
	 * 保存
	 */
	void saveData(RpAccountHistory rpAccountHistory) throws AccountBizException;

	/**
	 * 更新
	 */
	void updateData(RpAccountHistory rpAccountHistory) throws AccountBizException;

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	RpAccountHistory getDataById(String id) throws AccountBizException;
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, RpAccountHistory rpAccountHistory) throws AccountBizException;
	
}