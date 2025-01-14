package org.example.beans.factory.support;

import org.example.beans.factory.config.BeanDefinition;

/**
 * @author Chloe
 * @date 2025/01/13
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
