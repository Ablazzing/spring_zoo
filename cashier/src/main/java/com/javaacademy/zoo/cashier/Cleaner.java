package com.javaacademy.zoo.cashier;

public class Cleaner {
    private String name;

    public Cleaner(String name) {
        this.name = name;
    }

    public void clean() {
        System.out.println("Чистка вольеров");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
               "name='" + name + '\'' +
               '}';
    }
}
