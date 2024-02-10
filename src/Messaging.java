import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Messaging extends Thread{
    private Socket clientSocket;
    public Messaging(Socket clientSocket){
        this.clientSocket = clientSocket;
    }
    @Override
    public void run(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
            String msg = "";
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
