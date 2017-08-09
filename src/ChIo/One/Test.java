package ChIo.One;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
            // 通过Scanner进行交互
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要打印出的文件夹：(windows下分隔符请使用“\\”)");
            // 接收输入的内容
            String pan = sc.next();
            // 实例化File类
            File file = new File(pan);
            // 调用lists方法
            lists(file);
        }

        public static void lists(File file) {
            if (file.isDirectory()) { // 判断是否为文件夹
                File[] list = file.listFiles(); // 使用数组接收带有完整路径的文件夹
                if (list != null) {
                    // 循环遍历文件
                    for (int i = 0; i < list.length; i++) {
                        lists(list[i]);
                        System.out.println("文件名:  " + list[i].getName());
                        System.out.println("文件路径:  " + list[i].getAbsolutePath());
                    }
                }
                // 输出文件名称
                //System.out.println(file);
            }
        }
}
