/**
 * Created by ethan on 2018/7/11.
 */

package zyx.practise.springprac.autowiring;

public class MailDaoImpl implements MailDao {
    @Override
    public void done() {
        System.out.println("MailDaoImpl.invoke...");
    }
}
