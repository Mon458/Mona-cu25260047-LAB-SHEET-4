class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        double l = 10;
        double b = 5;

        r.length = l;
        r.breadth = b;

        r.calculateArea();
    }
}
