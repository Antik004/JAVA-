import java.io.*;
import java.util.Scanner;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example file.\nHello, this is a test content.\nEnjoy coding!";

        try (FileWriter fileWriter = new FileWriter(fileName); 
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(content);
            System.out.println("Content written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            System.out.println("\nReading file using FileReader and BufferedReader:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file with FileReader: " + e.getMessage());
        }

        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("\nReading file using Scanner:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file with Scanner: " + e.getMessage());
        }
    }
}
