package socket_learn;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept(); //establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream()); //returns InputStream attached with this socket
            String str = (String) dis.readUTF();
            System.out.println("Someone Leaved a message for you :: "+str);
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
