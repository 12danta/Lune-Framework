package org.example.test.ioc;

import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author Chloe
 * @date 2025/01/14
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {
    @Test
    public void testBeanFactory() throws Exception{
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService",beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
