/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.dao.impl;

import com.roncoo.pay.common.core.dao.impl.BaseDaoImpl;
import com.roncoo.pay.service.point.dao.RpPointAccountHistoryDao;
import com.roncoo.pay.service.point.entity.RpPointAccountHistory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>功能说明:
 * </b>
 *
 * @author
 *
 */
@Repository
public class RpPointAccountHistoryDaoImpl extends BaseDaoImpl<RpPointAccountHistory> implements RpPointAccountHistoryDao{
    /**
     * 根据请求号获取账户历史
     *
     * @param requestNo
     **/
    @Override
    public RpPointAccountHistory getByRequestNo(String requestNo) {
        Map<String , Object> paramMap = new HashMap<String , Object>();
        paramMap.put("requestNo",requestNo);
        return super.getBy(paramMap);
    }
}
