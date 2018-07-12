/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-12
 */
package zyx.practise.springprac.annotations;

import org.springframework.stereotype.Repository;
import zyx.practise.springprac.UserDao;

@Repository
public class UserDaoAnnoImpl implements UserDao {


    @Override
    public int addUser() {
        return 321;
    }

    @Override
    public void updateUser() {
        System.out.println("update user with annotation injection");
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void findUser() {

    }
}
