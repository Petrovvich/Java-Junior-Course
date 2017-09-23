package realTimeTest;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class testHTMLFromWeb {

    public static void main(String[] args) throws IOException {

        URLConnection urlConnection =  new URL("https://www.discogs.com/" ).openConnection();
        Scanner scanner = new  Scanner(urlConnection.getInputStream());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
