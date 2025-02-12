package org.example.test.ioc;

import org.example.beans.PropertyValue;
import org.example.beans.PropertyValues;
import org.example.beans.factory.config.BeanDefinition;
import org.example.beans.factory.config.BeanReference;
import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.example.test.ioc.bean.Car;
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
    @Test
    public void testPopulateBeanWithBean() throws Exception{
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册Car实例
        PropertyValues propertyValuesForCar = new PropertyValues();
        propertyValuesForCar.addPropertyValue(new PropertyValue("brand","porsche"));
        BeanDefinition carBeanDefinition = new BeanDefinition(Car.class,propertyValuesForCar);
        beanFactory.registerBeanDefinition("car",carBeanDefinition);

        //注册Person实例
        PropertyValues propertyValuesForPerson = new PropertyValues();
        propertyValuesForPerson.addPropertyValue(new PropertyValue("name","halo"));
        propertyValuesForPerson.addPropertyValue(new PropertyValue("age",27));
        //Person 实例化依赖Car实例
        propertyValuesForPerson.addPropertyValue(new PropertyValue("car",new BeanReference("car")));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class,propertyValuesForPerson);
        beanFactory.registerBeanDefinition("person",beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("halo");
        assertThat(person.getAge()).isEqualTo(27);
        Car car = person.getCar();
        assertThat(car).isNotNull();
        assertThat(car.getBrand()).isEqualTo("porsche");

    }
}
