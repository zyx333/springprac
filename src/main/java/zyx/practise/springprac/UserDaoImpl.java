/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac;

public class UserDaoImpl implements UserDao {
    @Override
    public int addUser() {
        System.out.println("add user...");
//        throw new RuntimeException("exception runing..");
        return 0;
    }

    @Override
    public void updateUser() {
        System.out.println("update user...");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user...");
    }

    @Override
    public void findUser() {
        System.out.println("find user...");
    }
}
