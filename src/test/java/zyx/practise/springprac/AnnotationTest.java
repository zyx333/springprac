/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-12
 */
package zyx.practise.springprac;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zyx.practise.springprac.annotations.UserService;
import zyx.practise.springprac.annotations.UserServiceAnnoImpl;

public class AnnotationTest {
    @Test
    public void testAnnotationInjection() {
//        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(
//                UserServiceAnnoImpl.class);
//        UserService userService = (UserService)configApplicationContext.getBean("userServiceAnnoImpl");
//        userService.testUpdate();
    }
}
