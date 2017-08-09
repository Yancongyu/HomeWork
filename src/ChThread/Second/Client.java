package ChThread.Second;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("127.0.0.1",1111);
        BufferedReader in =null;
        PrintWriter out=null;
        try{
            in= new BufferedReader(
                    new InputStreamReader(
                            s.getInputStream()));
            out= new PrintWriter(
                    new OutputStreamWriter(s.getOutputStream()),true);
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("客户端已经连接");
//		    TreeMap<Integer,Integer> hs=new TreeMap<Integer,Integer>();
                String str = sc.nextLine();
                out.println(str);
                if(str.equals("exit")){
                    break;
                }
                String msg = in.readLine();
                System.out.println("服务器说"+msg);
            }
            System.out.println("b");
        }
        finally{
            out.close();
            in.close();
            s.close();
        }

    }
}
