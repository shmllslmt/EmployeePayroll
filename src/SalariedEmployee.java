import java.time.LocalDate;

// concrete subclass
public class SalariedEmployee extends Employee {
    private double annualSalary;
    SalariedEmployee(String employeeID, String name, LocalDate hireDate, double annualSalary) {
        super(employeeID, name, hireDate);
        this.annualSalary = annualSalary;
    }
    // must implement (override) abstract method of the super class
    @Override
    public double calcMonthlyPay() {
        return annualSalary / 12;
    }

    // specialised method
    public double giveAnnualBonus(double bonusPercentage) {
        // assuming that bonus percentage is in decimal form, e.g. 5% is 0.05
        return calcMonthlyPay() * bonusPercentage;
    }

    @Override
    public String toString() {
        return super.getEmployeeDetails() + "\n" +
                "Monthly Pay: "+String.format("%.2f", calcMonthlyPay())+"\n"+
                "Annual Bonus: "+giveAnnualBonus(0.3);
    }
}
