/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.point.entity;

import com.roncoo.pay.common.core.entity.BaseEntity;

import java.io.Serializable;

/**
 * @功能说明: 账户信息
 * @创建者: zenghao 陈德元()
 */
public class RpPointAccount extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1996976092574646493L;
	
    /** 用户编号 **/
    private String userNo;
    
    /** 账户余额 **/
    private Integer balance;
    
    
    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }



}