import java.util.*;

class bindec {
    public static void main(String[] args) {
        decimalToBinary(5);
    }
    
    static void decimalToBinary(int decNum) {
        int resNum = 0;
        int power = 0;
        
        while (decNum > 0) {
            int rem = decNum % 2;
            decNum = decNum / 2;
            resNum =resNum+rem *(int) Math.pow(10, power); 
            power++;
        }
        
        System.out.println("Result is " + (int)resNum); 
    }
}
