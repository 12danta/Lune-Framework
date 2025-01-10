package org.example.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chloe
 * @date 2025/01/10
 */
public class BeanFactory {
    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name,Object bean) {
        beanMap.put(name,bean);
    }
    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
