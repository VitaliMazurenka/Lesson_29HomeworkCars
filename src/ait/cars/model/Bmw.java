package ait.cars.model;

public class Bmw extends Car{
    public Bmw(String regNumber, String model, String company, double engine, String colour) {
        super(regNumber, model, company, engine, colour);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bmw{");
        sb.append('}');
        return sb.toString();
    }
}
