package ChIo.Third;

import java.io.*;

///**
// * Created by Administrator on 2017/7/15.
// */
public class Test {
    public static void main(String[]args){
        try {
            FileReader fr = new FileReader("H:\\test.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("H:\\testt.txt");
            //BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(fw);
            String str = "";
            int num = 1;
//            while((str = br.readLine()) != null){
//                System.out.println(str);
//            }
            while((str = br.readLine()) != null){
                if(str.length() > 0){
                    if(str.trim().indexOf("//") !=0){
                        pw.write(num + ":" + str + "\r\n");
                        num++;
                    }
                }
            }
            br.close();
            fr.close();
            pw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
