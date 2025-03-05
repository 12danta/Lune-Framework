package org.example.beans.factory.support;

import org.example.beans.BeansException;
import org.example.core.io.Resource;
import org.example.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinition的接口
 * @author Chloe
 * @date 2025/03/05
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();
    ResourceLoader getResourceLoader();
    void loadBeanDefinitions(Resource resource) throws BeansException;
    void loadBeanDefinitions(String location) throws BeansException;
    void loadBeanDefinitions(String[] locations) throws BeansException;
}
