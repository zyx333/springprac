/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * IOC implemented using annotation
 */

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountDao accountDao() {
        return new AccountDaoImpl();
    }

    @Bean
    public AccountService accountService() {
        AccountServiceImpl bean =  new AccountServiceImpl();
        bean.setAccountDao(accountDao());
        return bean;
    }
}
