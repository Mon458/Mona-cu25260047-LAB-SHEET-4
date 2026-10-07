class EmployeeCompare {
    String name;
    double salary;
    static String organization = "ABC Company";

    public static void main(String[] args) {
        EmployeeCompare e1 = new EmployeeCompare();
        EmployeeCompare e2 = new EmployeeCompare();

        String name1 = "Mona";
        double salary1 = 30000;

        String name2 = "Rahul";
        double salary2 = 35000;

        e1.name = name1;
        e1.salary = salary1;

        e2.name = name2;
        e2.salary = salary2;

        System.out.println("Organization: " + organization);
        System.out.println(e1.name + " Salary: " + e1.salary);
        System.out.println(e2.name + " Salary: " + e2.salary);

        if (e1.salary > e2.salary)
            System.out.println(e1.name + " has higher salary");
        else if (e2.salary > e1.salary)
            System.out.println(e2.name + " has higher salary");
        else
            System.out.println("Both have equal salary");
    }
}
