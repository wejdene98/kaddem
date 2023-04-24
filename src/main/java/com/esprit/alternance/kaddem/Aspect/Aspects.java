package com.esprit.alternance.kaddem.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class Aspects {

    //Before advice
    @Before("execution(* com.esprit.alternance.kaddem.services.*.*(..))")
    public void doBefore(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        log.info("doBefore: "+name);
    }
    // After returning advice
    @AfterReturning(pointcut = "execution(* com.esprit.alternance.kaddem.services.*.*(..))", returning = "result")
    public void doAfterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        log.info("doAfterReturning   " + name );
        log.info("Resultat de la methode doAfterReturning  " + name + ":  " + result);
    }

    // After throwing advice
    @AfterThrowing(pointcut = "execution(* com.esprit.alternance.kaddem.services.*.*(..))", throwing = "error")
    public void doAfterThrowing(JoinPoint joinPoint, Throwable error) {
        String name = joinPoint.getSignature().getName();
        log.info("doAfterThrowing   " + name );
        log.info("Erreur de la methode doAfterThrowing " + name + " : " + error);
    }


    // After advice
    @After("execution(* com.esprit.alternance.kaddem.services.*.*(..))")
    public void doAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("doAfter  " + name );
    }

    // Around advice
    @Around("execution(* com.esprit.alternance.kaddem.services.*.*(..))")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start=System.currentTimeMillis();
        Object obj = proceedingJoinPoint.proceed();
        long elapsedTime=System.currentTimeMillis() - start;
        System.out.println("Temps d'execution de la methode  :" + elapsedTime+ "milliseconds");
        return obj;
    }


}
