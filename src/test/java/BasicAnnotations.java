import org.testng.annotations.*;

public class BasicAnnotations {

  @Test
  public void testCase1() {
    System.out.println("In test case 1");
  }

  @Test
  public void testCase2() {
    System.out.println("In test case 2");
  }

  @BeforeMethod
  public void beforeMethod(){
    System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod(){
    System.out.println("after method");
  }

  @BeforeTest
  public void beforeTest(){
    System.out.println("before test");
  }

  @AfterTest
  public void afterTest(){
    System.out.println("After test");
  }

  @BeforeClass
  public void beforeClass(){
    System.out.println("before class");
  }

  @AfterClass
  public void afterClass(){
    System.out.println("After class");
  }
}
