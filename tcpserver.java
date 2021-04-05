import java.net.* ;
import java.io.* ;


 public class tcpserver{

    public static void main(String[] args){
        int port = 9876;

        try{
             ServerSocket server = new ServerSocket(port);
             while(true)
             {
                 Socket client = server.accept();
                 Connection c = new Connection(client);
     
             }
        }
        catch(Exception e){
            System.out.println("Catch Block");
        }
        
    }
}

//socket is interface between port and ip... it provides full duplex connection..
//tcp ssttrream oriented ho. auta packet send gare tyo packet jassai pani destination ma receive huncha... udp ma packet pugna ni sakcha napugna ni sakcha
//tcp reliable huncha..  jun ma data lost huna hunna testo ma tcp lekhni .. tcp is secure vanni haina  
//udp is fast ... tcp is slow

//zoom , viber, skype etc.. video conferencing apps uses udp ... tcp use hune facebook messaging
