/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-12
 */
package zyx.practise.springprac.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyx.practise.springprac.UserDao;

@Service
public class UserServiceAnnoImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void testUpdate() {
//        userDao.updateUser();
        System.out.println("execute update");
    }
}
