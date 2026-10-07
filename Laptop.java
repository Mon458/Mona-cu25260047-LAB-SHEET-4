class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();

        String laptopBrand = "HP";
        int laptopRAM = 16;

        l.brand = laptopBrand;
        l.RAM = laptopRAM;

        l.display();
    }
}
