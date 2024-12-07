import java.util.*;

public class Cafe {
    public int item = 0;
        int Cart[] = new int[6];
        int Bill = 0;

    public void cart(int code) {
        if (item >= 6 && code != 0) {
            System.out.println("Cart is full. Remove an item before adding more.");
            return;
        }
        switch (code) {
            case 1:
                Cart[item] = 1;
                System.out.println("Item Added---Pizza");
                item++;
                break;
            case 2:
                Cart[item] = 2;
                System.out.println("Item Added---Burger");
                item++;
                break;
            case 3:
                Cart[item] = 3;
                System.out.println("Item Added---French Fries");
                item++;
                break;
            case 4:
                Cart[item] = 4;
                System.out.println("Item Added---Coffee");
                item++;
                break;
            case 5:
                Cart[item] = 5;
                System.out.println("Item Added---Tea");
                item++;
                break;
            case 6:
                Cart[item] = 6;
                System.out.println("Item Added---Water Bottle");
                item++;
                break;
            case 0:
                if (item > 0) {
                    item--;
                    System.out.println("Item removed.");
                } else {
                    System.out.println("No items to remove.");
                }
                break;
            default:
                System.out.println("Thanks for buying!!");
                break;
        }
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Welcome--------");
        System.out.println("Pizza------------ItemCode(1)------Rs.100/-");
        System.out.println("Burger-----------ItemCode(2)------Rs.50/-");
        System.out.println("French Fries-----ItemCode(3)------Rs.30/-");
        System.out.println("Coffee-----------ItemCode(4)------Rs.20/-");
        System.out.println("Tea--------------ItemCode(5)------Rs.10/-");
        System.out.println("Water Bottle-----ItemCode(6)------Rs.10/-");

        while (true) {
            System.out.println("Please Enter item Code:");
            System.out.println("Press 0 to delete recently added item.");
            System.out.println("Press any other number to exit.");

            int code = sc.nextInt();

            if (code < 0 || code > 6) break;

            cafe.cart(code);
        }

        System.out.println("----- Final Bill -----");
        for (int i = 0; i < cafe.item; i++) {
            switch (cafe.Cart[i]) {
                case 1:
                    cafe.Bill += 100;
                    System.out.println("Pizza-------Rs.100/-");
                    break;
                case 2:
                    cafe.Bill += 50;
                    System.out.println("Burger------Rs.50/-");
                    break;
                case 3:
                    cafe.Bill += 30;
                    System.out.println("French Fries--Rs.30/-");
                    break;
                case 4:
                    cafe.Bill += 20;
                    System.out.println("Coffee-------Rs.20/-");
                    break;
                case 5:
                    cafe.Bill += 10;
                    System.out.println("Tea----------Rs.10/-");
                    break;
                case 6:
                    cafe.Bill += 10;
                    System.out.println("Water--------Rs.10/-");
                    break;
            }
        }
        System.out.println("Bill: Rs." + cafe.Bill + "/-");
        System.out.println("GST---Rs."+(0.18*cafe.Bill));
        System.out.println("Total Cost----Rs."+(cafe.Bill+(0.18*cafe.Bill)));
        System.out.println("Thank you for visiting!");
    }
}
