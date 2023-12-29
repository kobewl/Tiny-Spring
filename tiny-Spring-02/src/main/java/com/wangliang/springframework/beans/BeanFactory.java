package com.wangliang.springframework.beans;

import com.wangliang.springframework.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
