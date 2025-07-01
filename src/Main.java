import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee("001", "Alex", LocalDate.parse("2025-01-01"), 100000);

        HourlyEmployee emp2 = new HourlyEmployee("002", "Bill", LocalDate.parse("2025-01-01"), 150, 45);

        System.out.println(emp1);
        emp2.recordHours(50);
        emp2.recordHours(20, "Abstraction Training");
        System.out.println(emp2);
    }
}