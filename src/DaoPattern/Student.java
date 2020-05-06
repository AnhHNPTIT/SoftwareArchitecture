package DaoPattern;
public class Student{
    private int id;
    private String name;
    private String dOB;
    
    public Student(int id, String name, String dOB){
        this.id = id;
        this.name = name;
        this.dOB = dOB;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getDOB(){
        return dOB;
    }
    
    public void setDOB(String dOB){
        this.dOB = dOB;
    }
}
