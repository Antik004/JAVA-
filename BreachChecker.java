import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;

public class BreachChecker {
    public static void main(String[] args) {
        String website = "example.com";  // Get website dynamically when user logs in
        checkWebsiteBreach(website);
    }

    public static void checkWebsiteBreach(String domain) {
        try {
            URL url = new URL("https://breachdirectory.org/api?domain=" + domain);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            Scanner scanner = new Scanner(conn.getInputStream());
            String response = scanner.useDelimiter("\\A").next();
            scanner.close();

            JSONObject jsonResponse = new JSONObject(response);
            if (jsonResponse.getString("status").equals("success")) {
                System.out.println("⚠️ WARNING: " + domain + " was breached!");
            } else {
                System.out.println("✅ No breaches found for " + domain);
            }
        } catch (Exception e) {
            System.out.println("Error checking breach: " + e.getMessage());
        }
    }
}