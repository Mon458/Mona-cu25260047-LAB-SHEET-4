class Person {
    String name;
    int age;
    static String country = "India";

    void checkVoting() {
        boolean eligible = age >= 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (eligible)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
    }

    public static void main(String[] args) {
        Person p = new Person();

        String personName = "Mona";
        int personAge = 20;

        p.name = personName;
        p.age = personAge;

        p.checkVoting();
    }
}
