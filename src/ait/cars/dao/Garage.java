package ait.cars.dao;


import ait.cars.model.Car;

public interface Garage {
    public abstract boolean addCar(Car car);

    int capacity();

    Car removeCar(String regNumber);


    Car findCarByRegNumber(String regNumber);


    Car[] findCarByModel(String model);

    Car[] findCarsByCompany(String company);

    Car[] findCarsByEngine(double min, double max);

    Car[] findCarsByColor(String color);
}

