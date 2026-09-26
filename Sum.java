import java.util.Scanner;

class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        Calculator cal = new Calculator();

        int result = cal.add(a, b);

        System.out.println("Sum = " + result);

        sc.close();
    }
}
