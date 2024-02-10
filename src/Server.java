import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4001);
        System.out.println("Server started waiting for connection");
        Socket clientSocket = socket.accept();
        System.out.println("Connection accepted");
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
        String msg = "";
        do{

            msg = reader.readLine();
            writer.println("server sents you greetings"+msg);
        }
        while(!msg.equals("exit"));
    }
}