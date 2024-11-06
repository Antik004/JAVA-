import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a test file.");
            writer.newLine();
            writer.write("This line is added to the file.");
            writer.write("  No new line added here");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
