import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
  String message = "Piyush";
  MessageUtil messageUtil = new MessageUtil(message);

  @Test(expectedExceptions = ArithmeticException.class)
  public void testPrintMessage() {
    System.out.println("Inside testPrintMessage()");
    messageUtil.printMessage();
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
    message = "HI!" + "Piyush";
    Assert.assertEquals(message, messageUtil.salutationMessage());
  }
}
