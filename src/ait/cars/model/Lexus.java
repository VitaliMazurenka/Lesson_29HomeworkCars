package ait.cars.model;

public class Lexus extends Car{
    public Lexus(String regNumber, String model, String company, double engine, String colour) {
        super(regNumber, model, company, engine, colour);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lexus{");
        sb.append('}');
        return sb.toString();
    }
}
