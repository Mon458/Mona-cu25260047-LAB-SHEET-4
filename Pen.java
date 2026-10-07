class Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        Pen p = new Pen();

        String penColor = "Blue";
        String penType = "Ball Pen";

        p.color = penColor;
        p.type = penType;

        p.display();
    }
}
