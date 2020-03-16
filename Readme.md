1、MainTest 模拟生成订单，并模拟银行通知支付成功
2、MainTest通过调用com.roncoo.pay.controller.ScanPayNotifyController的接口接收银行通知成功请求，并写入activemq
3、com.roncoo.pay.app.queue.BankMessageListener中监听银行通知消息队列
    //完成支付成功处理（内部分布式事务）
    rpTradePaymentManagerService.completeScanPay(payWayCode, notifyMessageMap);
    //删除消息
    rpTransactionMessageService.deleteMessageByMessageId(messageId);
    
4、支付成功处理逻辑
rpTradePaymentManagerService.completeScanPay(payWayCode, notifyMessageMap);
    // 1、发送会计记账预处理消息
    rpTradePaymentManagerBiz.completeSuccessOrder(rpTradePaymentRecord, bankTrxNo, timeEnd, bankReturnMsg);
    // 2、TCC
    rpTradePaymentManagerBiz.completeSuccessOrder(rpTradePaymentRecord, bankTrxNo, timeEnd, bankReturnMsg);
        // 2.1 更新本地支付状态
        // 2.2 更新账户金额
        rpAccountTransactionService.creditToAccountTcc
        // 2.3 更新账户积分
        rpPointAccountService.creditToPointAccountTcc
    // 3、确认并发送会计记账消息
    rpTransactionMessageService.confirmAndSendMessage
    // 尤其注意此处调用异步，否则抛错回滚导致状态不一致
    <dubbo:reference interface="com.roncoo.pay.service.message.api.RpTransactionMessageService" id="rpTransactionMessageService" check="false">
    		<dubbo:method name="confirmAndSendMessage" async="true" return="false" />
    </dubbo:reference>