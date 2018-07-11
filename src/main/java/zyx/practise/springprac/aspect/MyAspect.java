/*
 * Copyright (c) 2018, TP-Link Co.,Ltd.
 * Author:  zhangyuxiang <zhangyuxiang@tp-link.com.cn>
 * Created: 2018-07-11
 */
package zyx.practise.springprac.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

    @Before("execution(* zyx.practise.springprac.UserDao.addUser(..))")
    public void before(JoinPoint joinPoint) {
//        joinPoint.getSignature();
        System.out.println("do something before addUser.");
    }

    @AfterReturning(value = "execution(* zyx.practise.springprac.UserDao.addUser(..))", returning = "returnVal")
    public void afterReturning(Object returnVal) {
        System.out.println("do something after return " + returnVal);
    }

    @Around("execution(* zyx.practise.springprac.UserDao.addUser(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around...");
        Object obj = (Object) joinPoint.proceed();
        System.out.println("after around...");
        return obj;
    }

    @AfterThrowing(value = "execution(* zyx.practise.springprac.UserDao.addUser(..))", throwing = "e")
    public void afterThrowable(Throwable e) {
        System.out.println("throw exception:msg = " + e.getMessage());
    }

    @After(value = "execution(* zyx.practise.springprac.UserDao.addUser(..))")
    public void after() {
        System.out.println("final notifition.");
    }

    @Pointcut("execution(* zyx.practise.springprac.UserDao.addUser(..))")
    public void myPointCut() {
    }

    @After(value = "myPointCut()")
    public void afterDemo() {
        System.out.println("test after point cut.");
    }
}
