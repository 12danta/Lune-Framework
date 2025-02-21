package org.example.beans.factory;

import org.example.beans.BeansException;

import java.util.Map;

/**
 * @author Chloe
 * @date 2025/02/19
 */
public interface ListableBeanFactory extends BeanFactory{
    /**
     * 返回指定类型的所有实例
     */
    <T>Map<String,T> getBeansOfType(Class<T> type) throws BeansException;
    /**
     * 返回定义的所有bean的名称
     */
    String[] getBeanDefinitionNames();
}
