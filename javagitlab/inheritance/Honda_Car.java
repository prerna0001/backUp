package com;

public class Honda_Car extends Car
{
    public static void main(String[] args)
    {
        Car car=new Car();

        car.setGear(1);
        car.setSpeed(60);

        System.out.println("Information about car");
        System.out.println(car.getGear());
        System.out.println(car.getSpeed());

        Honda_Car honda_car=new Honda_Car();

        honda_car.setCar_Color("White");

        System.out.println("Information about Honda car");
        System.out.println(honda_car.getCar_Color());
    }
}
