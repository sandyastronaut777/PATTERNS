package socket_learn;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{

            Socket s = new Socket("localhost", 8080);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); //returns OutputStream attached with this socket
            System.out.println("Please leave a message!");
            String message = sc.nextLine();
            dos.writeUTF(message);
            dos.flush();
            dos.close();
            s.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
