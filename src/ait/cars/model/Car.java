package ait.cars.model;

public abstract class Car {
    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String colour;

    public Car(String regNumber, String model, String company, double engine, String colour) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "regNumber='" + regNumber + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", engine=" + engine +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car cars = (Car) o;

        return regNumber.equals(cars.regNumber);
    }

    @Override
    public int hashCode() {
        return regNumber.hashCode();
    }
}
