/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-12
 */
package zyx.practise.springprac;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zyx.practise.springprac.annotations.UserService;
import zyx.practise.springprac.annotations.UserServiceAnnoImpl;

public class AnnotationTest {
    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceAnnoImpl userServiceAnno;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAnnotationInjection() {
        userServiceAnno.testUpdate();
    }
}
