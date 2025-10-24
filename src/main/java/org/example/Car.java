package org.example;

public class Car {
    public Integer speed;
    public String model;
    public String color;

    public Car(Integer speed, String model, String color) {
        this.speed = speed;
        this.model = model;
        this.color = color;
    }

    public void move() {
        System.out.println("The car is moving at " + speed + " km/h.");
    }
}
