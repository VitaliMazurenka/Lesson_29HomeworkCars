package ait.cars.dao;

import ait.cars.model.Car;

public class GarageImpl implements Garage {
  private Car[] cars;

  private int size;

  public GarageImpl(int capacity) {
    cars = new Car[capacity]; // массив к-рый хранит кол во авто
  }

  @Override
  public boolean addCar(Car car) {
    if (car == null || cars.length == size || findCarByRegNumber(car.getRegNumber()) != null) {
      return false;
    }
    cars[size] = car;
    size++;
    return true;
  }

  @Override
  public int capacity() {
    return size;
  }

  @Override
  public Car removeCar(String regNumber) {
    for (int i = 0; i < size; i++) {
      if (cars[i].getRegNumber() == regNumber) {
        Car sold = cars[i];
        cars[i] = cars[size - 1];
        cars[size - 1] = null; //
        size--;
        return sold;
      }
    }
    return null;
  }
    @Override
    public Car findCarByRegNumber(String regNumber) {
      for (int i = 0; i < size; i++) {
        if(cars[i].getRegNumber()==regNumber){
          return cars [i];
        }
      }
      return null;
    }

  @Override
  public Car[] findCarByModel(String model) {
    return new Car[0];
  }

  @Override
  public Car[] findCarsByCompany(String company) {
    return new Car[0];
  }

  @Override
  public Car[] findCarsByEngine(double min, double max)  {
      int counter=0;
      for (int i = 0; i < size; i++) {
        if(cars[i]?????????????


        }

      }

  }

  @Override
  public Car[] findCarsByColor(String color) {
    return new Car[0];
  }
}
