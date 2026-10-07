class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    void assignGrade() {
        String grade;

        if (marks >= 80)
            grade = "A";
        else if (marks >= 60)
            grade = "B";
        else if (marks >= 40)
            grade = "C";
        else
            grade = "F";

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade();

        String studentName = "Mona";
        int studentMarks = 75;

        s.name = studentName;
        s.marks = studentMarks;

        s.assignGrade();
    }
}
