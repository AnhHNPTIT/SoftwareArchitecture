package DaoPattern;
public class AnhHN{
    public static void main (String[] args) {
        StudentDao studentDao = new StudentDaoImp();
        
        //print all students
        System.out.println("ID Name DOB");
        for(Student student: studentDao.getAllStudents()){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getDOB());
        }
        
        //add student
        Student st = new Student(3, "Hoang Do Minh Anh", "xxx");
        studentDao.addStudent(st);
        
        //update student
        st = new Student(1, "Hoang Ngoc Anh", "28/11/1997");
        studentDao.updateStudent(st);
        
        //delete student
        st = studentDao.getStudent(2);
        studentDao.deleteStudent(st);
        
        //print all students after update list
        System.out.println("\nID Name DOB");
        for(Student student: studentDao.getAllStudents()){
            System.out.println(student.getId() + " " + student.getName() + " " + student.getDOB());
        }
    }
}
