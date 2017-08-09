package ChIo.Three;

import java.io.*;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
        FileReader f;
        String s = "Hello World";
        BufferedReader br = null;

        try {
            f = new FileReader("H:\\test.txt");
            br = new BufferedReader(f);
            s = br.readLine();
            System.out.println("源文件" + s);
            s = s.replace("p","P");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        BufferedWriter bw = null;
        System.out.println(s);
        FileWriter fw = null;
        try {
            fw = new FileWriter("H:\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        bw = new BufferedWriter(fw);
        try {
            bw.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
