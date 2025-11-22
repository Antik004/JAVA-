import java.util.*;
class collection1
{
    public static void main(String[] args) {
        ArrayList <String> student = new ArrayList<>();
        student.add("Antik Adhya");

        student.add(1,"adhya");

        System.out.println(student);

        String k=student.get(1);
        System.out.println(k);

        

    }
}