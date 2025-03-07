package org.example.test.ioc;

import org.example.beans.factory.support.DefaultListableBeanFactory;
import org.example.beans.factory.xml.XmlBeanDefinitionReader;
import org.example.test.ioc.bean.Car;
import org.example.test.ioc.bean.Person;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * @author Chloe
 * @date 2025/03/07
 */
public class XmlFileDefineBeanTest {
    @Test
    public void testXmlFile() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("derek");
        assertThat(person.getCar().getBrand()).isEqualTo("porsche");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("porsche");
    }
}
