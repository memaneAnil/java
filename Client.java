import java.net.*;
import java.io.*;
public class Client
{
    public static void main(String arr[]) throws Exception
    {
        System.out.println("Client application is running...");

        Socket s=new Socket("localhost",2100);//(ipaddress(bank address),port number(counter no))
        System.out.println("Client is waiting for the server to accept the request");

        PrintStream ps=new PrintStream(s.getOutputStream());

        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));

        String str1,str2;

        
        
        while(!(str1=br2.readLine()).equals("end"))
        {
            
            System.out.println("Enter message for server :");
            ps.println(str1);
            
            str2=br1.readLine();
            System.out.println("Server says : "+str2);
            //ps.println(str2);
        }
    }
}