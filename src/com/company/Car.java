package com.company;

import java.util.Random;


public abstract class Car {
    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public static  void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(10000);

        int number2 = random.nextInt(3500);

        PassengerCar Renault = new PassengerCar(number2);

        Renault.setMax(3500);


        CargoCar kamaz = new CargoCar(number);

        kamaz.setMax(10000);

        System.out.println("Passenger car with maximum load " + number2);

        System.out.println("Cargo car with maximum load " + number);
    }
}
