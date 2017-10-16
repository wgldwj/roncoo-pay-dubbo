/*
 *
 * 陈德元：



 *
 */
package com.roncoo.pay.service.message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roncoo.pay.common.core.enums.NotifyDestinationNameEnum;
import com.roncoo.pay.common.core.enums.PublicEnum;
import com.roncoo.pay.common.core.utils.StringUtil;
import com.roncoo.pay.service.message.api.RpTransactionMessageService;
import com.roncoo.pay.service.message.entity.RpTransactionMessage;
import com.roncoo.pay.service.message.enums.MessageStatusEnum;

/**
 * 
 * @描述: 启动Dubbo服务用的MainClass.
 * @作者: WuShuicheng .
 * @创建时间: 2016-06-22,下午9:47:55 .
 * @版本: 1.0 .
 */
public class DubboMessageProvider {
	private static final Log log = LogFactory.getLog(DubboMessageProvider.class);

	public static void main(String[] args) {

		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
//			RpTransactionMessageService rpTransactionMessageService = (RpTransactionMessageService) context.getBean("rpTransactionMessageService");
//
//			// step1.查询出所有符合时间条件内的，状态为发送理状态的记录
//			Map<String, Object> paramMap = new HashMap<String, Object>();
//			// 获取配置的开始处理的时间
//			String dateStr = "2016-07-18 15:27:25";
//			paramMap.put("createTimeBefore", dateStr);// 取存放了多久的消息
//			paramMap.put("status", MessageStatusEnum.SENDING.name());// 取状态为发送中的消息
//			paramMap.put("areadlyDead", PublicEnum.NO.name());// 取存活的发送中消息
//			// 每次抓去5000条数据处理
//			paramMap.put("pageFirst", 0);
//			paramMap.put("pageSize", 1000);
//			List<RpTransactionMessage> messages = rpTransactionMessageService.listTimeOutMessage(paramMap);
//			System.out.println(messages.size());
		} catch (Exception e) {
			log.error("== DubboMessageProvider context start error:", e);
		}

		synchronized (DubboMessageProvider.class) {
			while (true) {
				try {
					DubboMessageProvider.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:", e);
				}
			}
		}
	}

}