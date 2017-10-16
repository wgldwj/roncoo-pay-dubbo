/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.dao.impl;

import com.roncoo.pay.common.core.dao.impl.BaseDaoImpl;
import com.roncoo.pay.service.point.dao.RpPointAccountDao;
import com.roncoo.pay.service.point.entity.RpPointAccount;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


/**
 * @类功能说明： 账户dao实现类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
@Repository
public class RpPointAccountDaoImpl  extends BaseDaoImpl<RpPointAccount> implements RpPointAccountDao{

	public RpPointAccount getByUserNo(String userNo){

		Map<String , Object> paramMap = new HashMap<String , Object>();
		paramMap.put("userNo",userNo);
		paramMap.put("isPessimist", true);
		return this.getSessionTemplate().selectOne(getStatement("getByUserNo"), paramMap);

	}
}