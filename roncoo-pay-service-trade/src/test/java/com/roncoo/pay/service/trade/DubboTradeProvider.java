package com.roncoo.pay.service.trade;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Description:
 * @author: tangmin
 * @date: 2017年03月15日 16:41
 * @version: 1.0
 */
public class DubboTradeProvider {
    private static final Log log = LogFactory.getLog(DubboTradeProvider.class);

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
            context.start();

        } catch (Exception e) {
            log.error("== DubboTradeProvider context start error:", e);
        }

        synchronized (DubboTradeProvider.class) {
            while (true) {
                try {
                    DubboTradeProvider.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:", e);
                }
            }
        }
    }
}
