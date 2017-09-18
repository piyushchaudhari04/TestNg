import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeFinancialDetailsTest {
  Employee employee;
  EmployeeFinancialDetails employeeFinancialDetails;

  @BeforeClass
  public void setup() {
    employee = new Employee("sam", 8000, 25);
    employeeFinancialDetails = new EmployeeFinancialDetails();
  }

  @Test
  public void calculateYearlySalaryTest() throws Exception {
    double salary = employeeFinancialDetails.calculateYearlySalary(employee);
    Assert.assertEquals(salary, 96000.0);
  }

  @Test
  public void testCalculateAppriasal() throws Exception {
    double appriasal=employeeFinancialDetails.calculateAppraisal(employee);
    Assert.assertEquals(appriasal,500.0);
  }
}
