import java.util.Scanner;

class Employee {
    private String eNo;
    private String eName;
    private double eSalary;

    public Employee(String eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public String getENo() {
        return eNo;
    }

    public String getEName() {
        return eName;
    }

    public double getESalary() {
        return eSalary;
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Enter Employee Number: ");
            String eNo = scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        System.out.print("Enter Employee Number to search: ");
        String searchENo = scanner.nextLine();

        Employee foundEmployee = searchEmployee(employees, searchENo);

        if (foundEmployee != null) {
            System.out.println("Employee Found: Number: " + foundEmployee.getENo() +
                    ", Name: " + foundEmployee.getEName() + ", Salary: " + foundEmployee.getESalary());
        } else {
            System.out.println("Employee not found.");
        }
        
        scanner.close();
    }

    public static Employee searchEmployee(Employee[] employees, String eNo) {
        for (Employee employee : employees) {
            if (employee.getENo().equals(eNo)) {
                return employee;
            }
        }
        return null;
    }
}
