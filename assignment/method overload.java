class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 = " + calc.add(10, 20));
        System.out.println("Sum of 10, 20 and 30 = " + calc.add(10, 20, 30));
        System.out.println("Sum of 5.5 and 4.5 = " + calc.add(5.5, 4.5));
    }
}