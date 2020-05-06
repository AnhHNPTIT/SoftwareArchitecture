package DecoratorPattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent{
    public String getName();
    
    public void doTask();
    
    public void join(Date joinDate);
    
    void terminate(Date terminateDate);
    
    public default String formatDate(Date theDate){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(theDate);
    }
    public default void showBasicInformation(){
        System.out.println("----------------");
        System.out.println("The basic information of " + getName());
        join(Calendar.getInstance().getTime());
        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 6);
        terminate(terminateDate.getTime());
    }
}

