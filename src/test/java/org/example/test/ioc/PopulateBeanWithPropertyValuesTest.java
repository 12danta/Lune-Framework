package org.example.test.ioc;

import org.example.beans.PropertyValue;
import org.example.beans.PropertyValues;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.example.test.ioc.bean.Person;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author Chloe
 * @date 2025/01/22
 */
public class PopulateBeanWithPropertyValuesTest {
    @Test
    public void testPopulateBeanWithPropertyValues() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name","Halo"));
        propertyValues.addPropertyValue(new PropertyValue("age",27));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class,propertyValues);
        beanFactory.registerBeanDefinition("person",beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("Halo");
        assertThat(person.getAge()).isEqualTo(27);

    }
}
