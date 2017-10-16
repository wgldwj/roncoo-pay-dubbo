/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.dao;

import com.roncoo.pay.common.core.dao.BaseDao;
import com.roncoo.pay.service.point.entity.RpPointAccountHistory;

/**
 * <b>功能说明:
 * </b>
 *
 * @author
 *
 */
public interface RpPointAccountHistoryDao extends BaseDao<RpPointAccountHistory> {

    /** 根据请求号获取账户历史 **/
    public RpPointAccountHistory getByRequestNo(String requestNo);
}