package org.example.beans.factory.support;

import org.example.beans.BeansException;
import org.example.core.io.DefaultResourceLoader;
import org.example.core.io.ResourceLoader;

/**
 * @author Chloe
 * @date 2025/03/05
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;
    public void setResourceLoader(ResourceLoader resourceLoader){
        this.resourceLoader = resourceLoader;
    }
    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry){
        this(registry, new DefaultResourceLoader());
    }
    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry,ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry(){
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String[] locations) throws BeansException {
        for(String location : locations) {
            loadBeanDefinitions(location);
        }
    }


}
