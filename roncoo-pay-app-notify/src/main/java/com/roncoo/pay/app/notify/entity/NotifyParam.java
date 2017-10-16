/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.app.notify.entity;

import java.util.Map;

/**
 * @功能说明:
 * @创建者:
 * @创建时间: 16/6/2  下午5:35
 *
 * @版本:V1.0 
 */
public class NotifyParam {

    private Map<Integer, Integer> notifyParams;// 通知时间次数map
    private String successValue;// 通知后用于判断是否成功的返回值。由HttpResponse获取

    public Map<Integer, Integer> getNotifyParams() {
        return notifyParams;
    }

    public void setNotifyParams(Map<Integer, Integer> notifyParams) {
        this.notifyParams = notifyParams;
    }

    public String getSuccessValue() {
        return successValue;
    }

    public void setSuccessValue(String successValue) {
        this.successValue = successValue;
    }

    public Integer getMaxNotifyTime() {
        return notifyParams == null ? 0 : notifyParams.size();
    }

}
