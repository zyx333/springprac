/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac.autowiring;

public class MailServiceConstructorImpl implements MailService {
    private MailDao mailDao;

    public MailServiceConstructorImpl(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public void done() {
        mailDao.done();
    }
}
