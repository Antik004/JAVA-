public abstract class Faculty {
    String name;
    int facultyId;
    public Faculty(String name, int facultyId)
    {
        this.name=name;
        this.facultyId=facultyId;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Faculty Id:"+facultyId);
    }
    public abstract void Teach(int semNumber);
}
