import mocking.DatabaseService;
import mocking.Student;
import mocking.StudentDbManager;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;


public class StudentDbManagerTest {
  DatabaseService databaseService=mock(DatabaseService.class);

  @InjectMocks
  StudentDbManager studentDbManager=new StudentDbManager(databaseService);

  Student student;
  @BeforeMethod
  public void setup(){
    Student student=new Student("piyush", 1, "baner pune");
  }

  @Test
  public void testInsertStudent() throws Exception {
    when(databaseService.insert(student)).thenReturn(true);
    Assert.assertEquals(true,studentDbManager.insert(student));
    verify(databaseService,times(1)).insert(student);
  }

  @Test
  public void testDeleteStudent() throws Exception {
    when(databaseService.delete(student)).thenReturn(true);
    Assert.assertEquals(true,studentDbManager.delete(student));
    verify(databaseService).delete(student);
  }

  @Test
  public void testFetchStudent() throws Exception {
    when(databaseService.fetch(student)).thenReturn(true);
    Assert.assertEquals(true,studentDbManager.fetch(student));
    verify(databaseService).fetch(student);
  }
}
