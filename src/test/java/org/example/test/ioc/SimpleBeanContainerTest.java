package org.example.test.ioc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Chloe
 * @date 2025/01/10
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() throws Exception {
//        BeanFactory beanFactory = new BeanFactory();
//        beanFactory.registerBean("helloService",new HelloSevice());
//        HelloSevice helloSevice = (HelloSevice) beanFactory.getBean("helloService");
//        assertThat(helloSevice).isNotNull();
//        assertThat(helloSevice.sayHello()).isEqualTo("hello");
    }
    class HelloSevice{
        public String sayHello(){
            System.out.println("hello");
            return "hello";
        }
    }
}
