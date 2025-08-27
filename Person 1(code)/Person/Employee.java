import java.lang.*;

public class Employee extends Person {
    private String joiningDate;
    private double salary;

    public Employee() {
    }

    public Employee(int age, String name, double mass, String joiningDate, double salary) {
        super(age, name, mass);
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJoiningDate() {
        return joiningDate;
    }
	public double getSalary() {
        return salary;
    }

    public double weightCalculate() {
        
        return getMass() * 9.80; 
    }

    public double annualSalary() {
       
        return salary * 12;
    }
	public void showInfo() {
        super.showInfo(); 
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Salary: " + salary);
        System.out.println("Weight: " + weightCalculate());
        System.out.println("Annual Salary: " + annualSalary());
    }
}
