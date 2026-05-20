abstract class Student {
    String name;
    int roll;
    String course;
    double fee;

    Student(String name, int roll, String course, double fee) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.fee = fee;
    }

    abstract void attendClass();
    abstract void giveExam();
    abstract void payFee();

    void calculateGrade(int marks) {
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}