import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.io.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws  IOException {
//Thread.sleep(5000);
        Socket socket = new Socket("localhost", 4001);
        System.out.println("Connecting to " + socket.getPort());
    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
    String msg = "";
        Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter the message");
msg = sc.nextLine();
writer.println(msg);
String response = reader.readLine();
        System.out.println(response);

    }
    while(!msg.equals("exit"));

    }


}
