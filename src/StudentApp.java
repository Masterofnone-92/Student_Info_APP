public class StudentApp {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("pekka Niemi", "543626", "Linux");
        Student student2 = new Student("Muntasir Islam", "634765", 20, true, "macOS");
        Student student3 = new Student("Yan Tuo", "569874", 30, false, "Windows11");
        Student student4 = new Student("Gui Cong", "623819", 20, true, "Windows 10");

        student1.bePresent();
        student1.addStudyRecord(15);
        student1.addStudyRecord(25);
        student2.addStudyRecord(20);
        student3.addStudyRecord(30);
        student4.addStudyRecord(10);

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
    public String operatingSystem;

    public Student() {
        name = "";
        studentNumber = "";
        credits = 0;
        attendanceStatus = false;
    }

    // Constructor 1
    public Student(String name, String studentNumber, String operatingSystem) {
        this.name = name;
        this.studentNumber = studentNumber;
        credits = 0;
        attendanceStatus = false;
        this.operatingSystem = operatingSystem;
    }

    // Constructor 2 for all attributes
    public Student(String name, String studentNumber, int credits, boolean attendanceStatus, String operatingSystem) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.credits = credits;
        this.attendanceStatus = attendanceStatus;
        this.operatingSystem = operatingSystem;
    }

    // Study record
    public void addStudyRecord(int creditAmount) {
        if (attendanceStatus) {
            credits = credits + creditAmount;
        } else {

            System.out.println("Student is absent.Can't add study record.");
        }
    }

    public void printCreditinfo() {
        System.out.println("Has  " + credits + " credits");

    }

    public void bePresent() {
        attendanceStatus = true;

    }

    public void beAbsent() {
        attendanceStatus = false;

    }

    // Print all the student data
    public void printInfo() {
        System.out.println("Name:  " + name);
        System.out.println("Student number: " + studentNumber);
        printCreditinfo();
        if (attendanceStatus) {

            System.out.println("Student is present.");
        } else {
            System.out.println("Student is absent.");
        }
        System.out.println("Operating System: " + operatingSystem);
    }

}
