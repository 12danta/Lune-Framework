package org.example.beans.factory.support;

import org.example.beans.BeansException;
import org.example.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 简单bean实例化策略，根据bean的无参构造函数实例化对象
 * @author Chloe
 * @date 2025/01/15
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try{
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        }catch (Exception e) {
            throw new BeansException("Failed to instantiate ["+ beanClass.getName() + "]",e);
        }

    }
}
