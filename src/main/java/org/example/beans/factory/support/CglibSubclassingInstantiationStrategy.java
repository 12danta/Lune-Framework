package org.example.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.example.beans.BeansException;
import org.example.beans.factory.config.BeanDefinition;

/**
 * 使用CgLib动态生成子类
 * @author Chloe
 * @date 2025/01/15
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor)(obj, method, argsTemp, proxy) -> proxy.invoke(obj,argsTemp));
        return enhancer.create();
    }
}
