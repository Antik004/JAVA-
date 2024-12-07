import java.util.*;
class a{
    void show(){
        System.out.println("Parent");
    }
};
class b extends a
{
    @Override
    void show(){
        super.show();
        System.out.println("Child");
    }
};
public class overrider{
public static void main(String[] args)
{
    b obj=new b();
    obj.show();
}
}