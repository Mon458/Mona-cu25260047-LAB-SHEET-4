class Student {
    String name;
    int age;
    static int count = 0;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        String studentName = "Mona";
        int studentAge = 20;

        s1.name = studentName;
        s1.age = studentAge;

        count++;

        s1.display();

        System.out.println("Total Students: " + count);
    }
}
