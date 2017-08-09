package Three.Sixteen;

/**
 * Created by Administrator on 2017/6/20.
 */
public class Test{
    public static void main(String[]args){
        double salary = 30000;
        double sum = 0;
        for(int i = 0 ; i < 10 ; i++){
            salary += salary * 0.06;
            sum += salary;
        }
        System.out.println(salary + " " + sum);
    }
}
