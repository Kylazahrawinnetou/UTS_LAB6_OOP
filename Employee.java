import java.util.Scanner;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        // Validate salary to ensure it's positive
        if (salary <= 0) {
            this.salary = 0;
            System.out.println("Warning: Salary cannot be negative. Setting to 0.");
        }
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setters
    public void setSalary(int salary) {
        this.salary = salary;

        // Validate salary again
        if (salary <= 0) {
            this.salary = 0;
            System.out.println("Warning: Salary cannot be negative. Setting to 0.");
        }
    }

    // Calculate annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by a percentage
    public int raiseSalary(int percent) {
        if (percent < 0) {
            System.out.println("Error: Raise percentage cannot be negative.");
            return salary;
        }
        salary += (salary * percent) / 100;
        return salary;
    }

    // Override toString() for a more informative representation
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}