/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zyx.practise.springprac.ioc.AccountService;
import zyx.practise.springprac.ioc.BeanConfiguration;

public class AccountServiceIocTest {

    @Test
    public void testByXml() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();
    }

    @Test
    public void testByConfigurationAnnotation() throws Exception {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
                BeanConfiguration.class);
        AccountService accountService = (AccountService)configApplicationContext.getBean("accountService");
        accountService.doSomething();
    }
}
