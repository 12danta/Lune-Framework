package org.example.beans.factory.xml;

import org.example.beans.BeansException;
import org.example.beans.factory.support.AbstractBeanDefinitionReader;
import org.example.beans.factory.support.BeanDefinitionRegistry;
import org.example.core.io.Resource;
import org.example.core.io.ResourceLoader;

/**
 * @author Chloe
 * @date 2025/03/05
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public static final String Bean_ELEMENT = "bean";
    public static final String PROPERTY_ELEMENT = "property";
    public static final String ID_ATTRIBUTE = "name";
    public static final String NAME_ATTRIBUTE = "name";
    public static final String CLASS_ATTRIBUTE = "class";
    public static final String VALUE_ATTRIBUTE = "value";
    public static final String REF_ATTRIBUTE = "ref";

    protected XmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public XmlBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        super(registry, resourceLoader);
    }

    @Override
    public void loadBeanDefinitions(Resource resource) throws BeansException {

    }

    @Override
    public void loadBeanDefinitions(String location) throws BeansException {

    }
}
