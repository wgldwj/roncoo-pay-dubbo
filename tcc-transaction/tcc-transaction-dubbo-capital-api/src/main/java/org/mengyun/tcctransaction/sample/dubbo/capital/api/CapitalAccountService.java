package org.mengyun.tcctransaction.sample.dubbo.capital.api;

import java.math.BigDecimal;

/**
 * Created by  on 16/11/11.
 */
public interface CapitalAccountService {

    BigDecimal getCapitalAccountByUserId(long userId);
}