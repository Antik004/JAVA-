
import java.util.ArrayList;
import java.util.Scanner;

public class arraydynamic { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements (type -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            arr.add(num);
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }
}
