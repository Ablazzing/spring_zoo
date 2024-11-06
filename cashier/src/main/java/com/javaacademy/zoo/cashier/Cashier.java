package com.javaacademy.zoo.cashier;

import com.javaacademy.zoo.cafe.Restaurant;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Cashier {
    private Restaurant restaurant;

    public Cashier(@Lazy Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void printReport() {
        System.out.println("___________________________________________");
        System.out.println("Продано 100 билетов!");
        System.out.println("___________________________________________");
    }

    public void printRestaurantOutcome() {
        restaurant.printOutcome();
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
