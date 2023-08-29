package ait.cars.test;

import ait.cars.dao.Garage;
import ait.cars.dao.GarageImpl;
import ait.cars.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] cars;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Bmw("AA321", "i8", "BMW", 1.5, "blue");
        cars[1] = new Jaguar("AA333", "X-Type", "Jaguar", 4.2, "black");
        cars[2] = new Toyota("AA350", "Land Cruiser", "Toyota", 4.6, "silver");
        cars[3] = new Lexus("AA380", "LS", "Lexus", 5.0, "white");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);

        }

    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car car = new Toyota("AA400", "Land Cruiser", "Toyota", 4.6, "silver");
        assertTrue(garage.addCar(car));
        assertEquals(5, garage.capacity());
        car = new Toyota("AA500", "Land Cruiser", "Toyota", 4.6, "silver");
        assertFalse(garage.addCar(car));

    }

    @Test
    void removeCar() {
        Car car = garage.removeCar("AA350");
        assertEquals(cars[2], car);
        assertEquals(3, garage.capacity());
        assertNull(garage.removeCar("AA350"));
    }

    @Test
    void findCarByRegNumber() {
        Car car = garage.findCarByRegNumber("AA333");
        assertEquals(cars[1], car);
        car = garage.findCarByRegNumber("AA500");
        assertNull(car);
    }

    @Test
    void findCarByModel() {
        Car[] actual = garage.findCarByModel("LS");
        Car[] expected = {cars[3]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("Toyota");
        Car[] expected = {cars[2]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(4.4, 6.0);
        Car[] expected = {cars[2], cars[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByCompany("black");
        Car[] expected = {cars[1]};
        assertArrayEquals(expected, actual);

    }


}


