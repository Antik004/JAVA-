import java.util.*;
 class  bigdecimal {
     public static boolean isNumber(String s) {
     String regex="^[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?$";
     // String regex2="^[+-]?\\d+(\\.\\d+)?([eE][+-]?\\d+)?(\\.)?$";
     // String regex3="^[+-]?(\\.)?\\d+(\\d+)?([eE][+-]?\\d+)?$";
     if(s.matches(regex))
     {
         return true;
     }
     else
     {
         return false;
     }
    }

     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number you can think of number");
        String s=sc.nextLine();
        boolean x=isNumber(s);
        if(x==true)
        {
            System.out.println("This is a number");
        }
        else
        {
            System.out.println("This is not a number");
        }
     }
    }
    
 