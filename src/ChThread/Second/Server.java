package ChThread.Second;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1111);
        BufferedReader in=null;
        PrintWriter out=null;
        try{
            Socket s = ss.accept();
            System.out.println("客户端连接"+s.getInetAddress().getHostAddress());
            in= new BufferedReader(new InputStreamReader(s.getInputStream()));
            out= new PrintWriter( new OutputStreamWriter(s.getOutputStream()),true);

            while(true){
                String str = in.readLine();
                String[] arr=str.split(" ");
                int[] arr1=new int[arr.length];
                try{
                    for(int n=0;n<arr.length;n++){
                        arr1[n]=Integer.parseInt(arr[n]);
                    }
                    Arrays.sort(arr1);

                    if(str.equals("exit")){
                        break;
                    }
                    System.out.println("客户端说"+str);
                    System.out.println("排序之后");

                    for(int n=0;n<arr1.length;n++){
                        out.print(arr1[n]+" ");
                    }
                }catch(Exception e){
                    out.print(" ");
                }



//	    	Scanner sc = new Scanner(System.in);
//	    	String serStr = sc.nextLine();
                out.println();
                out.flush();
            }
            System.out.println(" ");
        }
        finally{
            out.close();
            in.close();
            ss.close();
        }

    }
}
