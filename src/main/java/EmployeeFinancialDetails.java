public class EmployeeFinancialDetails {

  public double calculateYearlySalary(Employee employee) {
    return employee.getSalary() * 12;
  }

  public double calculateAppraisal(Employee employee) {
    double appraisal = 0;

    if (employee.getSalary() < 10000) {
      appraisal = 500;

    } else {
      appraisal = 1000;
    }

    return appraisal;
  }
}
