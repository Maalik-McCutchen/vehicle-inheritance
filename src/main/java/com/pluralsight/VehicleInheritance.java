package com.pluralsight;

public class VehicleInheritance {
    public static void main(String[] args) {


        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
        System.out.println();
        System.out.println(slowRide.getFuelCapacity());

        /* Why are you able to access the Vehicle getters/setters when you did not create an
        instance of the Vehicle class?*/

        // Answer: Because of extend can access the Vehicle class to get the color and set the color
    }
}
