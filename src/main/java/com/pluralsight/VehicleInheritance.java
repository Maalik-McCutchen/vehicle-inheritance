package com.pluralsight;

public class VehicleInheritance {
    public static void main(String[] args) {


        Moped slowRide = new Moped();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());
        System.out.println();
        System.out.println(slowRide.getFuelCapacity());
    }
}
