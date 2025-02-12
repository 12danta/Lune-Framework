package org.example.beans.factory.config;

/**
 * @author Chloe
 * @date 2025/02/12
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
