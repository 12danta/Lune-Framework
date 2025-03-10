package org.example.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chloe
 * @date 2025/01/17
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
    public PropertyValue getPropertyValue(String propertyName) {
        for(int i = 0; i < this.propertyValueList.size();i++) {
            PropertyValue pv = this.propertyValueList.get(i);
            if (pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}
