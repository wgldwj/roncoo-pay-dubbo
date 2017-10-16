/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.app.queue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roncoo.pay.app.queue.utils.SpringContextUtil;

/**
 * 
 * @描述: 通知APP.
 * @作者:
 * @创建: 2016-5-14,下午3:11:19
 * @版本: V1.0
 *
 */
public class RoncooPayAppQueue {

	private static final Log LOG = LogFactory.getLog(RoncooPayAppQueue.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/spring-context.xml" });
			// 初始化SpringContextUtil
			SpringContextUtil ctxUtil = new SpringContextUtil();
			ctxUtil.setApplicationContext(context);
			
			context.start();
			LOG.info("== context start");
			
		} catch (Exception e) {
			LOG.error("== application start error:", e);
			return;
		}
		
		synchronized (RoncooPayAppQueue.class) {
			while (true) {
				try {
					RoncooPayAppQueue.class.wait();
				} catch (InterruptedException e) {
					LOG.error("== synchronized error:", e);
				}
			}
		}
	}
}
