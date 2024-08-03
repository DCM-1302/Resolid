package Correcciones2;



public class SalaryCalculator {
    private ISalaryOperations salaryOperations;

    public SalaryCalculator(ISalaryOperations salaryOperations) {
        this.salaryOperations = salaryOperations;
    }

    public double calculateSalary(IEmployee employee) {
        return salaryOperations.calculateSalary(employee);
    }
}
