package com.stackroute.domain;

        import org.springframework.beans.factory.DisposableBean;
        import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemo implements InitializingBean, DisposableBean
{
    public void customInit()
    {
        System.out.println("Inside custom Init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("in destroy method");
    }

    public void customDestroy()
    {
        System.out.println("In custom Destroy");
    }
}
