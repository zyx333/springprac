/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zyx.practise.springprac.autowiring.MailService;

public class AutowiringTest {
    @Test
    public void testAutowiring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MailService mailService = (MailService) applicationContext.getBean("mailService");
        mailService.done();

        MailService mailService1 = (MailService) applicationContext.getBean("mailServiceCons");
        mailService1.done();

        MailService mailService2 = (MailService) applicationContext.getBean("mailServiceAnno");
        mailService2.done();
    }
}
