package DecoratorPattern;
public class AnhHN{
    public static void main (String[] args) {
        System.out.println("NORMAL EMPLOYEE:");
        EmployeeComponent employee = new EmployeeConcreteComponent("Minh Anh");
        employee.showBasicInformation();
        employee.doTask();
        
        System.out.println("TEAM LEADER:");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();
        
        System.out.println("MANAGER:");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();
        
        System.out.println("TEAM LEADER AND MANAGER:");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
