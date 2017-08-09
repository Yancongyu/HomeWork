package ChThread.Tihrd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Client {
    public static void main(String []args){
        BufferedReader br = null;
        String clientStr = "";

        try {
            Socket s = new Socket("127.0.0.1",500);
            System.out.println("客户端已经启动");
            Send send = new Send(s);
            Thread t = new Thread(send);
            t.start();
            while(true){
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("服务器说" + clientStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
