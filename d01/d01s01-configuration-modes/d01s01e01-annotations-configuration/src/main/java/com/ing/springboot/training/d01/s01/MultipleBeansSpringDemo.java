package com.ing.springboot.training.d01.s01;

import com.ing.springboot.training.d01.s01.beans.HelloSpring;
import com.ing.springboot.training.d01.s01.config.MultipleBeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * A first demo for the usage of a few simple Spring {@link org.springframework.context.annotation.Bean}s, using
 * annotations based configuration
 *
 * @author bogdan.solga
 */
public class MultipleBeansSpringDemo {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MultipleBeansConfig.class);

        //retrievingBeansByType(applicationContext);

        retrievingBeansByTypeAndID(applicationContext);
    }

    private static void retrievingBeansByType(final ApplicationContext applicationContext) {
        // 'give me the bean (object) of type HelloSpring from the application context'
        final HelloSpring helloSpring = applicationContext.getBean(HelloSpring.class);
        helloSpring.displayWelcomeMessage();

        // 'give me the bean (object) of type Product from the application context'
        //final Product product = applicationContext.Product(String.class);
        //System.out.println(product);
    }

    private static void retrievingBeansByTypeAndID(final ApplicationContext applicationContext) {
        // retrieving a bean by its type and ID
        final HelloSpring helloSpring = applicationContext.getBean("helloSpring", HelloSpring.class);
        helloSpring.displayWelcomeMessage();
    }
}
