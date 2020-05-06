package DaoPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao{
    // List is working as a database
    List<Student> students;
    
    public StudentDaoImp(){
        students = new ArrayList<Student>();
        Student student1 = new Student(1, "Hoang Ngoc Anh", "27/12/1997");
        students.add(student1);
        Student student2 = new Student(2, "Do Duc Canh", "05/07/1997");
        students.add(student2);
        
    }
    
    //retrive list of students from the database
    @Override
    public List<Student> getAllStudents(){
        return students;
    }
    
    @Override
    public Student getStudent(int id) {
        return students.get(id-1);
    }
    
    @Override
    public void addStudent(Student student){
        students.add(student);
    }
    
    @Override
    public void updateStudent(Student student){
        students.get(student.getId()-1).setName(student.getName());
        students.get(student.getId()-1).setDOB(student.getDOB());
    }
    
    @Override
    public void deleteStudent(Student student){
        students.remove(student.getId()-1);
    }
}
