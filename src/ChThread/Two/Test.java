package ChThread.Two;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Test {
    public static void main(String[]args){
        tt t1 = new tt(1,1000);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tt t2 = new tt(1001,2000);
        System.out.println();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tt t3 = new tt(2001,3000);
        System.out.println();
        t3.start();
    }
}
