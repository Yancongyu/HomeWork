package ChIo.Two;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
        try {
            FileReader f = new FileReader("H:\\test.txt");
            BufferedReader bf = new BufferedReader(f);
            System.out.println(bf.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
