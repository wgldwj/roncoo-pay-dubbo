/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.account.dao;

import java.util.List;
import java.util.Map;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.account.entity.RpAccountHistory;
import com.roncoo.pay.service.account.vo.DailyCollectAccountHistoryVo;

/**
 * @类功能说明： 账户历史dao
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public interface RpAccountHistoryDao  extends BaseDao<RpAccountHistory> {
	List<RpAccountHistory> listPageByParams(Map<String, Object> params);
	
	List<DailyCollectAccountHistoryVo> listDailyCollectAccountHistoryVo(Map<String, Object> params);

	RpAccountHistory getByRequestNo(String requestNo);

	/** 更新账户风险预存期外的账户历史记录记为结算完成 **/
	void updateCompleteSettTo100(Map<String, Object> params);
}