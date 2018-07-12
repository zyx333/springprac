/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-12
 */
package zyx.practise.springprac.autowiring.useannotation;

import org.springframework.beans.factory.annotation.Value;
import zyx.practise.springprac.autowiring.MailDao;
import zyx.practise.springprac.autowiring.MailService;

import javax.annotation.Resource;

public class MailServiceResourceImpl implements MailService {

//    @Resource(name = "mailDao")
    private MailDao mailDao;

    @Value("${jdbc.url}")
    private String url;
//    public MailServiceResourceImpl(MailDao mailDao) {
//        this.mailDao = mailDao;
//    }

    @Resource
    public void setMailDao(MailDao mailDao) {
        this.mailDao = mailDao;
    }

    @Override
    public void done() {
        mailDao.done();
        System.out.println(url);
    }
}
