package com.wangliang.springframework.beans.factory.factory;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
