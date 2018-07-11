/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac.autowiring;

public class MailServiceImpl implements MailService {
    private MailDao mailDao;

    public void setMailDao(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public void done() {
//        mailDao.done();

    }
}
