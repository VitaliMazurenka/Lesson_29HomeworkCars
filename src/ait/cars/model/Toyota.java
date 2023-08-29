package ait.cars.model;

public class Toyota extends Car {
    public Toyota(String regNumber, String model, String company, double engine, String colour) {
        super(regNumber, model, company, engine, colour);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Toyota{");
        sb.append('}');
        return sb.toString();
    }

}
