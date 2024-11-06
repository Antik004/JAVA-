import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExampleScanner {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
