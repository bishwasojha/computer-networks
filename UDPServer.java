import java.io.*;
import java.net.*;

public client UDPServer{

    public static void main(String args[]){
        DatagramSocket socket = null;
        try{
            byte[] buffer = new byte[1000];
            socket = new DatagramSocket(9876);
            while(true){
                DatagramPacket input = new DatagramPacket(buffer, buffer_length);
                socket.receive(input);
                DatagramPacket reply = new DatagramPacket(request.getData(), request.getlength(), request.get)
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}