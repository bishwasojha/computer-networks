import java.net.* ;
import java.io.* ;
public class tcpclient{

    public static void main(String[] args){
        int server_port = 9876;
        String server_ip = "192.168.0.2";
        Socket client = new Socket (server_ip,server_port);
        DataInputStream in = new DataInputStream();
        DataOutputStream out = new DataOutputStream();
        while(true){
            out.writeUTF("Hello TCP Socket!!!");
        }
    }
}

