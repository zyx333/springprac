/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac.ioc;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void addAccount() {
        System.out.println("addAccount...");
    }
}
