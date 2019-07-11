package com.stackroute.domain;

        import org.springframework.beans.BeansException;
        import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessorDemo implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In  postProcessBeforeInitialization of : "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In postProcessAfterInitialization of :"+beanName);
        return bean;

    }

}
