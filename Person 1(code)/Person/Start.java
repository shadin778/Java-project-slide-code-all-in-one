import java.lang.*;
public class Start {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee(30, "John Doe", 75.5, "2023-01-15", 60000);
        Employee employee2 = new Employee(25, "Jane Smith", 62.0, "2023-02-20", 55000);

        System.out.println("Employee 1 Information:");
        employee1.showInfo();

        System.out.println("\nEmployee 2 Information:");
        employee2.showInfo();
    }
}