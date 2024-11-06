import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples{

    public static void main(String[] args) {
        
        try {
            int[] arr = new int[5];
            int num = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            String str = null;
            str.length(); 
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            int num = Integer.parseInt("abc"); 
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

      
        try {
            Object obj = new Integer(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }

      
        try {
            Scanner scanner = new Scanner("abc");
            scanner.nextInt(); 
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }

      
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            scanner.nextLine(); 
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        }
    }
}
