package Prototype;

public class  Car implements Prototype {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public Car clone() {
        return new Car(this.brand, this.model);
    }

    public void showCar() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
