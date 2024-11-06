package com.javacademy.zoo.app;

import com.javaacademy.zoo.animal.Guard;
import com.javaacademy.zoo.animal.Tiger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Guard.class)
@ComponentScan(basePackages = {"com.javaacademy.zoo.cashier", "com.javaacademy.zoo.cafe"})
public class ZooConfig {

    @Bean
    public Tiger vasya() {
        return new Tiger("vasya");
    }

    @Bean
    public Tiger kolya() {
        return new Tiger("kolya");
    }
}
