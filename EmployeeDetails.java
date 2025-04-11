import java.util.Scanner;
class Employee {
    String name;
    int id;
    double salary;
    void inputDetails(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character from the buffer
        System.out.print("Enter Employee Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        salary = scanner.nextDouble();
    }
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("---------------------------");
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5]; // Array to hold 5 employees

        // Input details of employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].inputDetails(scanner);
        }
        // Display details of employees
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
        scanner.close();
    }
}