/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.user.entity;

import java.io.Serializable;

import com.roncoo.pay.common.core.entity.BaseEntity;
import com.roncoo.pay.common.core.enums.PublicStatusEnum;

/**
 * @类功能说明： 支付产品实体类
 * @类修改者：
 * @修改日期：
 * @修改说明：
 *
 * @作者：zh
 * @创建时间：2016-5-18 上午11:14:10
 * @版本：V1.0
 */
public class RpUserInfo extends BaseEntity implements Serializable {

    private String userNo;

    private String userName;

    private String accountNo;

    private static final long serialVersionUID = 1L;


    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }
    
    public String getStatusDesc() {
        return PublicStatusEnum.getEnum(this.getStatus()).getDesc();
    }

}