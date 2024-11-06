package com.javaacademy.zoo.cashier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashierConfig {

    @Bean(name = "mishaClear")
    public Cleaner cleaner1() {
        return new Cleaner("Миша");
    }

    @Bean
    public Cleaner cleaner2() {
        return new Cleaner("Вася");
    }

    @Bean
    public Cleaner cleaner3() {
        return new Cleaner("Галя");
    }
}
