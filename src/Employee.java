import java.time.LocalDate;
// abstract class
public abstract class Employee {
    private String employeeID;
    private String name;
    private LocalDate hireDate;

    Employee(String employeeID, String name, LocalDate hireDate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double calcMonthlyPay();

    // non-abstract (concrete) method
    public String getEmployeeDetails() {
        return  "Employee ID: " + employeeID + "\n" +
                "Employee Name: " + name + "\n" +
                "Hire Date: " + hireDate;
    }
}
