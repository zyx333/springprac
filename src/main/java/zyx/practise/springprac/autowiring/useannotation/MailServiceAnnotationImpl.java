/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac.autowiring.useannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import zyx.practise.springprac.autowiring.MailDao;
import zyx.practise.springprac.autowiring.MailService;

public class MailServiceAnnotationImpl implements MailService {
    @Autowired
    private MailDao mailDao;

    @Autowired
    public MailServiceAnnotationImpl(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Autowired
    public void setMailDao(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public void done() {
        mailDao.done();
    }
}
