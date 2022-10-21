package ru.netology.authorizationservice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* ru.netology.authorizationservice.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] arguments = joinPoint.getArgs();


        return joinPoint.proceed();
    }
}
