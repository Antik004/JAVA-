// import java.util.*;
// interface A{
//     void m1();
//     int k=10;// is always public,static,final
// };
// // abstract class B{
// //     int x;
// //     public B(int x){
// //         this.x=x;
// //     }
// //    protected int a=10;
// // };
// class C  implements A{
//     public void m1(){
//             System.out.println("Hello");
//         }
//     void display(){
//     // System.out.println(a);
//     System.out.println(k);
//     }
// }
// public class inter{
// public static void main(String[] args)
// {
//     C obj=new C();
//     obj.display();
//     obj.m1();
// }
// }
import java.util.*;

interface A {
    void m1(); // Abstract method
    int k = 10; // `public static final` by default
}

class C implements A {
    @Override
    public void m1() { // Must be `public` to satisfy the interface
        System.out.println("Hello");
    }

    void display() {
        System.out.println("Value of k: " + k); // Accessing the interface constant
    }
}

public class inter {
    public static void main(String[] args) {
        C obj = new C();
        obj.display(); // Prints the value of `k`
        obj.m1(); // Calls the overridden method
    }
}
