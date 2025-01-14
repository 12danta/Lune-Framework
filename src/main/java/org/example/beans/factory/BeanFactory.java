package org.example.beans.factory;

import org.example.beans.BeansException;

/**
 * @author Chloe
 * @date 2025/01/13
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
