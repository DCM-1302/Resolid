package Correcciones;

public class SalaryCalculator {
    private SalaryOperations salaryOperations;

    public SalaryCalculator(SalaryOperations salaryOperations) {
        this.salaryOperations = salaryOperations;
    }

    public double calculateSalary(String name) {
        return salaryOperations.calculateSalary(name);
    }
}
