package org.example.beans.factory.config;

/**
 * 单例注册表
 * @author Chloe
 * @date 2025/01/13
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
