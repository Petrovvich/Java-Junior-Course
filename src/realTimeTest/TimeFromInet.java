package realTimeTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TimeFromInet {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
        Scanner reader = new Scanner(socket.getInputStream());
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
    }
}
