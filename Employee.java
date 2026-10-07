class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        int id = 101;
        double sal = 30000;

        e.empId = id;
        e.salary = sal;

        e.display();
    }
}
