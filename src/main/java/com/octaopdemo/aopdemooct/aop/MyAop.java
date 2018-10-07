package com.octaopdemo.aopdemooct.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by abhi on 07/10/18.
 */

@Aspect
@Component
public class MyAop {

    @After(value=" execution (* com.octaopdemo.aopdemooct.MyController.MyControllerClass.getData(..))")
    public void checkAop(){
        System.out.println("after execution");
    }
}
