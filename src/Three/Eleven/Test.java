package Three.Eleven;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public int useFor(int num){
        int sum = 0;
        for(int i = 0 ; i < num ; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("for语句的" + sum);
        return sum;
    }
    public int useWhile(int num){
        int sum = 0,i = 0;
        while(i < num){
            if(i % 3 == 0){
                sum +=i;
            }
            i++;
        }
        System.out.println("while语句的" + sum);
        return sum;
    }
    public int useDo(int num){
        int sum = 0,i = 0;
        do{
            if(i % 3 == 0){
                sum += i;
            }
            i++;
        }while(i < num);
        System.out.println("doWhile语句的" + sum);
        return sum;
    }
    public static void main(String[]args){
        new Test().useFor(100);
        new Test().useDo(100);
        new Test().useWhile(100);
    }
}
