package ait.cars.model;

public class Jaguar extends Car {
    public Jaguar(String regNumber, String model, String company, double engine, String colour) {
        super(regNumber, model, company, engine, colour);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jaguar{");
        sb.append('}');
        return sb.toString();
    }
}
