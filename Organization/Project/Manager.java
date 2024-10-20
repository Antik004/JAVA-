
package Organization.Project;
import java.util.*;
import Organization.Employee;


public class Manager extends Employee{
    String projectName;
    int noOfTeams;
    public Manager( 
    int employeeId,   
    String name,
    Date dob,
    String department,
    String projectName,
    int noOfTeams){
        super(employeeId, name, dob, department);
        this.projectName=projectName;
        this.noOfTeams=noOfTeams;
    }
public void display(){
    super.display();
    System.out.println("Project name is"+projectName);
    System.out.println("Number of Teams is"+noOfTeams);
}
}
