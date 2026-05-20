public class StudentManagementSystem {
    public static void main(String[] args) {

        EIV s1 = new EIV("Isha", 101, "BECE", 50000);

        s1.displayInfo();

        s1.attendClass();
        s1.giveExam();
        s1.payFee();

        s1.calculateGrade(85);

        s1.checkBorrowedBooks();
        s1.showCourseBooks();

        s1.getStudentMask();
    }
}