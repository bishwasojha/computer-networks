import java.io.*;
import java.net.*;

public class UDPClient{

    public static void main(String args[]){
        int server_port = 9678;
        DatagramSocket socket = null;
        InetAddress server
        try{
            byte[] buffer = new buffer();
            byte[] msg = "Hello World".getBytes();
            socket = new DatagramSocket();
            while(true){
                DatagramPacket input = new DatagramPacket(msg, msg.length, "localhost", 9678);
                content.
                DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
                socket.receive(reply);
            }
        } 
        catch(Exception e){
            System.out.println(e);
        }


    }
}