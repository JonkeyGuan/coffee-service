package com.example;

public class Coffee {

    private long id;

    private String name;

    private String description;

    private double price;

    public Coffee() {
    }

    public Coffee(final long id, final String name, final String description, final double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

}