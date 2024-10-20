package Organization;
import java.util.*;
public class Employee {
        int  employeeId;
        String name;
        Date dob;
        String department;

        public Employee(int  employeeId,
        String name,
        Date dob,
        String department)
        {
            this.employeeId=employeeId;
            this.name=name;
            this.dob=dob;
            this.department=department;
        }
public void display(){
System.out.println("Employee id:"+employeeId);
System.out.println("Name"+name);
System.out.println("Date of Birth"+dob);
System.out.println("Department:"+department);
}

}
