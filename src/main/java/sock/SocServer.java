package sock;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("S : Server Started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("S : Server is waiting for client request");
        Socket s = ss.accept();

        System.out.println("S : Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        System.out.println("S : Client Data: "+str);

        String nick = str.substring(0,3);

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(nick);
        os.flush();
        System.out.println("S : Data sent from Server to Client");

    }
}
