package ChThread.Two;

/**
 * Created by Administrator on 2017/7/15.
 */
public class tt extends Thread{

    int start = 0;
    int end = 0;

    public tt(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        System.out.print(Thread.currentThread().getName() + ":");
        for(int i = start ; i < end ; i++){
            boolean b = true;
            for(int j = 2 ; j < i ; j++){
                if(i%j == 0) {
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.print(i + " ");
            }
        }
    }

}
