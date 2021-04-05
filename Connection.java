import java.net.* ;
import java.io.* ;

class  Connection extends Thread{
    private DataInputStream in;
    private DataOutputStream out ;
    private Socket client;

    public Connection (Socket client) {  //constructor doesnot contain return type
        this.client = client;
        this.in = new DataInputStream(client.getInputStream());
this.out = new DataOutputStream(client.getOutputStream());


        this.start();

    }
    

        
          
    public void run(){
        byte[] buffer = new byte[1000];
        while(true) {
        int r_len = in.read(buffer);
        int s_len = out.write(buffer,0,r_len);
    }
    } 
}