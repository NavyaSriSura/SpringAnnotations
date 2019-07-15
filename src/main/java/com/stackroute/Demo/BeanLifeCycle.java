package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying the bean");
    }

    public void customInit() {
        System.out.println("Custom Init method");
    }

    public void customDestroy() {
        System.out.println("Custom Destroy method");
    }
}
