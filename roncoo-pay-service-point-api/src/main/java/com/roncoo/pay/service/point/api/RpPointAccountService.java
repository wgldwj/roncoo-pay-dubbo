/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.api;

import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.point.entity.RpPointAccount;
import com.roncoo.pay.service.point.exceptions.PointBizException;
import org.mengyun.tcctransaction.api.TransactionContext;

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
public interface RpPointAccountService{
	
	/**
	 * 保存
	 */
	void saveData(RpPointAccount rpPointAccount) throws PointBizException;

	/**
	 * 更新
	 */
	void updateData(RpPointAccount rpPointAccount) throws PointBizException;

	void creditToPointAccountTcc(TransactionContext transactionContext, String userNo, Integer pointAmount, String requestNo,String bankTrxNo, String trxType, String remark) throws PointBizException;

	void creditToPointAccount(String userNo, Integer pointAmount, String requestNo,String bankTrxNo, String trxType, String remark) throws PointBizException;

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	RpPointAccount getDataById(String id) throws PointBizException;
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, RpPointAccount rpPointAccount) throws PointBizException;
	
}