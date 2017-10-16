/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.api;

import com.roncoo.pay.common.core.exception.BizException;
import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.service.point.entity.RpPointAccount;
import com.roncoo.pay.service.point.exceptions.PointBizException;

import java.util.List;
import java.util.Map;

/**
 * @类功能说明： 账户查询service接口
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpPointAccountQueryService {

	/**
	 * 根据用户编号编号获取账户信息
	 * 
	 * @param userNo
	 *            用户编号
	 * @return
	 */
	RpPointAccount getAccountByUserNo(String userNo) throws PointBizException;

	/**
	 * 根据参数分页查询账户.
	 * 
	 * @param pageParam
	 *            分页参数.
	 * @param params
	 *            查询参数，可以为null.
	 * @return AccountList.
	 * @throws BizException
	 */
	PageBean queryAccountListPage(PageParam pageParam, Map<String, Object> params) throws PointBizException;
	
	/**
	 * 获取所有账户
	 * @return
	 */
	List<RpPointAccount> listAll() throws PointBizException;
}