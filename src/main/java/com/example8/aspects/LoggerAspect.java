package com.example8.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example8.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " method execution start.");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took for method execution: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end.");
    }

    // annotation way of aspect programming
    @Around("@annotation(com.example8.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(joinPoint.getSignature().toString() + " method execution start.");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();

        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took for method execution: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end.");
    }

    @AfterThrowing(value = "execution(* com.example8.services.*.*(..))", throwing = "ex")   // 'ex' will be passed as an argument to the function
    public void logException(JoinPoint joinPoint, Exception ex) throws Throwable {
        logger.log(Level.SEVERE, joinPoint.getSignature() + " Exception thrown from @AfterThrowing which happens due to: " + ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example8.services.*.*(..))", returning = "val")
    public void logStatus(JoinPoint joinPoint, Object val) {
        if (val != null) {
            logger.log(Level.INFO, joinPoint.getSignature() + " returned: " + val.toString());
        } else {
            logger.log(Level.INFO, joinPoint.getSignature() + " returned null");
        }
    }
}
