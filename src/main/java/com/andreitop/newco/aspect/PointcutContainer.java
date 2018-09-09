package com.andreitop.newco.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutContainer {

    @Pointcut("execution( * com.andreitop.newco.repository.*Repo*.find*(*))")
    public void repositoryFind() {
    }

    @Pointcut("execution( * com.andreitop.newco.service.*Service*.*save*(*))")
    public void serviceSave() {
    }

    @Pointcut("execution( * com.andreitop.newco.service.*Service*.*delete*(*))")
    public void serviceDelete() {
    }

    @Pointcut("execution( * com.andreitop.newco.service.*Service*.*update*(*))")
    public void serviceUpdate() {
    }

    @Pointcut("execution( * com.andreitop.newco.service.*Service*.findAll*())")
    public void serviceFindAll() {
    }
}
