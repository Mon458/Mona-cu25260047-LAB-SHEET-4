class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Car c = new Car();

        String carBrand = "Toyota";
        double carMileage = 20.5;

        c.brand = carBrand;
        c.mileage = carMileage;

        c.display();
    }
}
