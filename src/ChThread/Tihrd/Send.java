package ChThread.Tihrd;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Send implements Runnable{
    Socket s;
    Scanner sc = new Scanner(System.in);
    PrintWriter pw;

    public Send(Socket s){
        this.s = s;
    }

    public void run(){
        while(true){
            try {
                pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
                String str = sc.next();
                pw.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
