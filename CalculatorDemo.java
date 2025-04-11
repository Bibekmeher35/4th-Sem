class Calculator {
    double num1, num2;
    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void add() {
        System.out.println("Addition: " + (num1 + num2));
    }
    void subtract() {
        System.out.println("Subtraction: " + (num1 - num2));
    }
    void multiply() {
        System.out.println("Multiplication: " + (num1 * num2));
    }
    void divide() {
        if (num2 != 0)
            System.out.println("Division: " + (num1 / num2));
        else
            System.out.println("Division by zero is not allowed.");
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator(20, 10);
        calc.add();
        calc.subtract();
        calc.multiply();
        calc.divide();
    }
}