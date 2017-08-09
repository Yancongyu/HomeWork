package Test;

import java.io.*;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Test1 {
    public static void main(String[] args) {
        File f = new File("H:\\test.txt");
        File ff = new File("H:\\testt.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            fw = new FileWriter(ff);
            PrintWriter pw = new PrintWriter(fw);
            String str = null;
            int num = 1;
            while((str = br.readLine()) != null){
                System.out.println(str);
                if(str.length() > 0){
                    if(str.trim().indexOf("//") != 0){
                        pw.write(num + ":" + str + "\r\n");
                        num++;
                    }
                }
            }
            br.close();
            fr.close();
            pw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
