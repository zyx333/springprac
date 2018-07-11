/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zyx.practise.springprac.ioc.Account;
import zyx.practise.springprac.ioc.AccountService;

public class AccountServiceIocTest {

    @Test
    public void testByXml() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();

        Account account = (Account) applicationContext.getBean("account");
        System.out.println(account.getBooks());
        account.getAccountDao().addAccount();
    }
}
