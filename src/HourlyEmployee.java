import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    HourlyEmployee(String employeeID, String name, LocalDate hireDate, double hourlyRate, int hoursWorked) {
        super(employeeID, name, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calcMonthlyPay() {
        return hourlyRate * hoursWorked;
    }
    // recordHours() are overloading methods
    // same name, different signature (different parameter list)
    public void recordHours(double hours) {
        hoursWorked += hours;
        System.out.println("Your hours has increased to "+hoursWorked+" hours.");
    }
    public void recordHours(double hours, String activityDescription) {
        hoursWorked += hours;
        System.out.println("Your hours has increased to "+hoursWorked+" hours of "+activityDescription);
    }

    @Override
    public String toString() {
        return super.getEmployeeDetails() + "\n" +
                "Monthly Pay: "+String.format("%.2f", calcMonthlyPay())+"\n"+
                "Hours Worked: " + hoursWorked + "\n" +
                "Hourly Rate: " + hourlyRate;
    }
}
