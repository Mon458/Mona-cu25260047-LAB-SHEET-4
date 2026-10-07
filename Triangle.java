class Triangle {
    double a;
    double b;
    double c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkValidity() {
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);

        System.out.println("Triangle Type: " + type);

        if (valid)
            System.out.println("Triangle is valid");
        else
            System.out.println("Triangle is not valid");
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        double sideA = 5;
        double sideB = 6;
        double sideC = 7;

        t.a = sideA;
        t.b = sideB;
        t.c = sideC;

        t.checkValidity();
    }
}
