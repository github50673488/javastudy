package p20210205_2_other_pattern.p6_Data_Access_Object_DAO_pattern;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}