package ChThread.Tihrd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Server {
    public static void main(String[]args){
        BufferedReader br = null;
        String clientStr = "";
        try {
            ServerSocket ss = new ServerSocket(500);
            System.out.println("服务器已经启动");
            Socket s = ss.accept();
            System.out.println(s.getInetAddress() + "已经连接");
            Send send = new Send(s);
            Thread t = new Thread(send);
            t.start();
            while(true){
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                clientStr = br.readLine();
                System.out.println("客户端说" + clientStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
