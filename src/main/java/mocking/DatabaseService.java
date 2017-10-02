package mocking;

public interface DatabaseService {
  boolean insert(Student student);
  boolean fetch(Student student);
  boolean delete(Student student);
}
