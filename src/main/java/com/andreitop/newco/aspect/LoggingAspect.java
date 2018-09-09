package com.andreitop.newco.aspect;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LogManager.getLogger(LoggingAspect.class);


    @Before("com.andreitop.newco.aspect.PointcutContainer.repositoryFind()")
    public void beforeRepoFind(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is about to be called");
    }

    @Before("com.andreitop.newco.aspect.PointcutContainer.serviceDelete()")
    public void beforeServiceDelete(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is about to be called");
    }

    @Before("com.andreitop.newco.aspect.PointcutContainer.serviceSave()")
    public void beforeServiceSave(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is about to be called");
    }

    @Before("com.andreitop.newco.aspect.PointcutContainer.serviceUpdate()")
    public void beforeServiceUpdate(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " is about to be called");
    }
    @After("com.andreitop.newco.aspect.PointcutContainer.repositoryFind()")
    public void afterRepoFind(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " was just called");
    }

    @After("com.andreitop.newco.aspect.PointcutContainer.serviceDelete()")
    public void afterServiceDelete(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " was just called");
    }

    @After("com.andreitop.newco.aspect.PointcutContainer.serviceSave()")
    public void afterServiceSave(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " was just called");
    }

    @After("com.andreitop.newco.aspect.PointcutContainer.serviceUpdate()")
    public void afterServiceUpdate(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " was just called");
    }

    @AfterReturning(pointcut = "com.andreitop.newco.aspect.PointcutContainer.serviceFindAll())",
                    returning = "result")
    public void afterServiceFindAll(JoinPoint joinPoint, Object result) {
        String className = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        logger.info(" ---> Method " + className + "." + methodName + " was just called");
        logger.info(" ---> Method return value: " + result.toString() );
    }

}
