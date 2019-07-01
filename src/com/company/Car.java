package com.company;

import java.util.Objects;

public class Car extends Vehicle {
    String color;
    String carBrand;
    double mileage;

    public Car() {
        this.color = "unknown";
        this.carBrand = "unknown";
        this.mileage = 0;
    }

    public Car(String carBrand, double mileage) {
        this.carBrand = carBrand;
        this.mileage = mileage;
    }

    public Car(String color, String carBrand, double mileage) {
        this.color = color;
        this.carBrand = carBrand;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String DisplayMileage() {
        return "The " + this.color + " " + this.carBrand + " is going " + this.mileage + " mph.";
    }

    public String DisplayWonCar(Car carBrand1, Car carBrand2) {

        return "The " + this.color + " " + carBrand1.getColor()
                + " " + carBrand1.getCarBrand() + " has just passed "
                + carBrand2.getColor() + " " + carBrand2.getCarBrand();
    }

    @Override
    public String Starting() {
        return "The " + this.color + " " + this.getCarBrand() + super.Starting();
    }

    @Override
    public String Accelerating() {
        return "The " + this.color + " " + this.getCarBrand() + super.Accelerating();
    }

    @Override
    public String Stopped() {
        return "The " + this.color + " " + this.carBrand + super.Stopped();
    }

    @Override
    public String EmissionCheck() {
        return "The " + this.color + " " + this.carBrand + super.EmissionCheck();
    }

    @Override
    public String PassEmissionCheck() {
        return "The " + this.color + " " + this.carBrand + super.PassEmissionCheck();
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.getMileage(), getMileage()) == 0 &&
                Objects.equals(getColor(), car.getColor()) &&
                Objects.equals(getCarBrand(), car.getCarBrand());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getColor(), getCarBrand(), getMileage());
    }
}