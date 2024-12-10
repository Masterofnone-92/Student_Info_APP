public class StudentApp {
    public static void main(String[] args) throws Exception {
        // Creating student instances
        Student student1 = new Student("pekka Niemi", "543626");
        Student student2 = new Student("Muntasir Islam", "634765", 20, true);
        Student student3 = new Student("Yan Tuo", "569874", 30, false);
        Student student4 = new Student("Gui Cong", "623819", 20, true);

        // Adding attendance and study records
        student1.bePresent();
        student1.addStudyRecord(15);
        student1.addStudyRecord(25);
        student2.addStudyRecord(20);
        student3.addStudyRecord(30);
        student4.addStudyRecord(10);

        // Printing student information
        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
    }
} // End of the studentAPP

class Student {
    public String name;
    public String studentNumber;
    public int credits;
    public boolean attendanceStatus;

    // Default constructor
    public Student() {
        name = "";
        studentNumber = "";
        credits = 0;
        attendanceStatus = false;
    }

    // Constructor with name and student number
    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        credits = 0;
        attendanceStatus = false;
    }

    // Constructor with all attributes
    public Student(String name, String studentNumber, int credits, boolean attendanceStatus) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.credits = credits;
        this.attendanceStatus = attendanceStatus;
    }

    // Adds credits to the student's record if they are present.
    public void addStudyRecord(int creditAmount) {
        if (attendanceStatus) {
            credits = credits + creditAmount;
        } else {

            System.out.println("Student is absent.Can't add study record.");
        }
    }

    // Prints the credit information of the student.
    public void printCreditInfo() {
        System.out.println("Has  " + credits + " credits");

    }

    // Marks the student as present.
    public void bePresent() {
        attendanceStatus = true;

    }

    // Marks the student as absent.
    public void beAbsent() {
        attendanceStatus = false;

    }

    // Prints detailed information about the student.
    public void printInfo() {
        System.out.println("Name:  " + name);
        System.out.println("Student number: " + studentNumber);
        printCreditInfo();
        if (attendanceStatus) {

            System.out.println("Student is present.");
        } else {
            System.out.println("Student is absent.");
        }

    }

}
