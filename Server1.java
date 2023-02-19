import java.net.*;
import java.io.*;

public class Server1
{
    public static void main(String arr[])throws Exception
    {
        ServerSocket ss=new ServerSocket(2100);

        Socket s=ss.accept();

        PrintStream ps= new PrintStream(s.getOutputStream());

        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));


        String str1,str2;


        while((str1=br1.readLine())!=null)
        {
            System.out.println("Client says :"+str1);
            System.out.println("Enter the message for client :");
            str2=br2.readLine();
            ps.println(str2);
        }
    }
}