package mocking;

public class StudentDbManager {
  DatabaseService databaseService;

  public StudentDbManager(DatabaseService databaseService) {
    this.databaseService = databaseService;
  }

  public boolean insert(Student student){
    return databaseService.insert(student);
  }

  public boolean delete(Student student){
    return databaseService.delete(student);
  }

  public boolean fetch(Student student){
    return databaseService.fetch(student);
  }
}
