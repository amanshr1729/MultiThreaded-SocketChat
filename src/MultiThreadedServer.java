import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer{


    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(4002);
        System.out.println("Server started waiting for connection");
        while(true){
            Socket clientSocket = socket.accept();
            System.out.println("Connection accepted");
            Messaging  msg = new Messaging(clientSocket);
            msg.start();
        }
    }
}
