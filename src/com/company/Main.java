package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // write your code here
        int userDefinedAddCarLimit;
        String colorCar;
        String brandCar;
        double mileageCar;
        Car vehicle = new Car();
        List<Car> carsList = new ArrayList<>();

        Car redPorsche = new Car("red", "Porsche", 50);
        System.out.println(redPorsche.Starting());
        System.out.println(redPorsche.Accelerating());
        System.out.println(redPorsche.DisplayMileage());
        System.out.println(redPorsche.Stopped());

        Car blueJetta = new Car("blue", "Jetta", 72.5);
        System.out.println(blueJetta.Starting());
        System.out.println(blueJetta.Accelerating());
        System.out.println(blueJetta.EmissionCheck());
        System.out.println(blueJetta.PassEmissionCheck());
        System.out.println(blueJetta.DisplayMileage());
        System.out.println(vehicle.DisplayWonCar(blueJetta, redPorsche));

        carsList.add(redPorsche);
        carsList.add(blueJetta);

        System.out.println("How many cars do you want to add?");
        userDefinedAddCarLimit = new Scanner(System.in).nextInt();
        for (int i = 0; i < userDefinedAddCarLimit; i++) {
            System.out.println("What is car color?");
            colorCar = new Scanner(System.in).nextLine();
            System.out.println("What is car brand?");
            brandCar = new Scanner(System.in).nextLine();
            System.out.println("What is car mileage?");
            mileageCar = new Scanner(System.in).nextDouble();
            carsList.add(new Car(colorCar,brandCar,mileageCar));
        }
        carsList.stream().map(Car::toString).forEach(System.out::println);
    }
}
