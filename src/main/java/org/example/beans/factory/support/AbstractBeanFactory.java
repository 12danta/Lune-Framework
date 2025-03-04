package org.example.beans.factory.support;

import org.example.beans.BeansException;
import org.example.beans.factory.BeanFactory;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.config.ConfigurableBeanFactory;

import java.beans.Beans;

/**
 * @author Chloe
 * @date 2025/01/13
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }
    @Override
    public<T> T getBean(String name,Class<T> requiredType) throws BeansException{
        return ((T) getBean(name));
    }
    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
