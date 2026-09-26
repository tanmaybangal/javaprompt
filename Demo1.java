public class Demo1 {
    public static void main(String args[]) {

        Student s1 = new Student();

        s1.name = "Joy";
        s1.age = 28;
        s1.rollNumber = 101;
        s1.college = "IIT BOMBAY";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }

    static class Student {
        String name;
        int age;
	int rollNumber;
        String college;
    }
}
	