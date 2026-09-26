public class Demo2 {
    public static void main(String args[]) {

        Student s1 = new Student("Rohit", 28, 102, "IIT BOMBAY");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        s1.markAttendence();

        Student s2 = new Student();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    // Default constructor
    Student() {
    }

    // Parameterized constructor
    Student(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }

    void markAttendence() {
        System.out.println("Attendance marked for student " + name);
    }
}