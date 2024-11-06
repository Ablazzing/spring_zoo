package com.javaacademy.zoo.cafe;

import com.javaacademy.zoo.cashier.Cashier;
import org.springframework.stereotype.Component;

/**
 * Ресторан
 */
@Component
public class Restaurant {
    private Cashier cashier;

    public Restaurant(Cashier cashier) {
        this.cashier = cashier;
    }

    public void giveFood() {
        System.out.println("___________________________________________");
        System.out.println("Дать еду людям!");
        System.out.println("___________________________________________");
        cashier.printReport();
    }

    public void printOutcome() {
        System.out.println("Расходы ресторана 1000 рублей!");
    }
}
