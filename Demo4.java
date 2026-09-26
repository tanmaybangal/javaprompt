public class Demo4 {
    public static void main(String args[]) {

        EngineeringStudent e1 = new EngineeringStudent();

        e1.name = "Rohit";
        e1.age = 20;

        System.out.println(e1.name);
        System.out.println(e1.age);

        e1.markAttendance();
        e1.attendLab();
    }
}

class Student {
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student {

    void attendLab() {
        System.out.println("Lab attended for engineering student");
    }
}

class MedicalStudent extends Student {

    void attendLab() {
        System.out.println("Lab attended for medical student");
    }
}