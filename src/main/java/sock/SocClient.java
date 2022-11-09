package sock;

import java.io.*;
import java.net.Socket;

public class SocClient {
    public static void main(String[] args) throws IOException {
        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip, port);
        String str = "Sandhya";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
//        os.write(str);
        out.println(str);
        os.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String nick = br.readLine();

        System.out.println("C : Data from Server "+nick);
    }
}
