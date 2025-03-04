package org.example.beans.factory.support;

import org.example.beans.BeansException;
import org.example.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 * @author Chloe
 * @date 2025/01/13
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 根据名称查找BeanDefinition
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 是否包含指定名称的BeanDefinition
     */
    boolean containsBeanDefinition(String beanName);
    /**
     * 返回定义的所有bean的名称
     */
    String[] getBeanDefinitionNames();
}
