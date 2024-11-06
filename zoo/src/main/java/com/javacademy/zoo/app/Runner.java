package com.javacademy.zoo.app;

import com.javaacademy.zoo.animal.Guard;
import com.javaacademy.zoo.animal.Tiger;
import com.javaacademy.zoo.cafe.Restaurant;
import com.javaacademy.zoo.cashier.Cashier;
import com.javaacademy.zoo.cashier.Cleaner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
@Slf4j
public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Runner.class);
        Map<String, Tiger> tigerMap = context.getBeansOfType(Tiger.class);
        log.info("Наши тигры: {}", tigerMap.values());
        Guard guard = context.getBean(Guard.class);
        guard.say();
        Cleaner cleaner = context.getBean("mishaClear", Cleaner.class);
        cleaner.clean();
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.giveFood();

        Cashier cashier = context.getBean(Cashier.class);
        cashier.printRestaurantOutcome();
    }
}
