public class Employee {
    String name;
    int yearOfJoining;
    String address;
    
    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    
    public void displayInfo() {
        System.out.printf("%-10s %-15d %s\n", name, yearOfJoining, address);
    }
    
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %s\n", "Name", "Year of Joining", "Address");
        Employee emp1 = new Employee("Ujwal", 2024, "BBS");
        Employee emp2 = new Employee("Ravi", 2023, "KUR");
        
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
