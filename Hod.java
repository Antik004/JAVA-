
public class Hod extends Faculty implements Admin {
    String department;
    public Hod(String name, int facultyId,String depaertment){
        super(name, facultyId);
        this.department=department;
    }
    public void select_cr(int year,String section){
        System.out.println("Class representative selected for the year:"+year+" Section:"+section);

    }
    public void Teach(int semNumber){
        System.out.println("Semester is"+semNumber+"Department:"+department);
    }
    public void display(){
        super.display();
        System.out.println(department);
    }
    public static void main(String[] args){
        Hod h1=new Hod(clgName, 0, clgName)
    }
}

