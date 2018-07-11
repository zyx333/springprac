/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {
    public void before() {
        System.out.println("xml=====before notification");
    }

    public void afterReturn(Object returnVal) {
        System.out.println("xml====return val:" + returnVal);
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("xml====before around");
        Object object = (Object) proceedingJoinPoint.proceed();
        System.out.println("xml====after around");
        return object;
    }

    public void afterThrowing(Throwable throwable) {
        System.out.println("xml====exception:" + throwable.getMessage());
    }

    public void after() {
        System.out.println("xml====final nitification.");
    }
}
