package com.wangliang.springframework.beans.factory.support;

import com.wangliang.springframework.BeansException;
import com.wangliang.springframework.beans.factory.factory.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("bean实例化失败",e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
