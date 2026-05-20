class EIV extends Student implements LibraryHelper {

    EIV(String name, int roll, String course, double fee) {
        super(name, roll, course, fee);
    }

    @Override
    void attendClass() {
        System.out.println(name + " is attending class.");
    }

    @Override
    void giveExam() {
        System.out.println(name + " is giving exam.");
    }

    @Override
    void payFee() {
        System.out.println(name + " paid fee: " + fee);
    }

    @Override
    public void checkBorrowedBooks() {
        System.out.println("No borrowed books.");
    }

    @Override
    public void showCourseBooks() {
        System.out.println("Books for course: " + course);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }

    void getStudentMask() {
        System.out.println("Student Mask ID: EIV-" + roll);
    }
}