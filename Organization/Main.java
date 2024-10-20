package Organization;
import Organization.Project.Manager;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Manager m1=new Manager(1, "Antik", new Date(2004,6,11), "CSE", "Website", 4);
        m1.display();
    }
}
