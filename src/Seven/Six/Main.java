package Seven.Six;

/**
 * Created by Administrator on 2017/7/9.
 */
public class Main {
    public static void foo(int number) throws ByteSizeException{
        if(number > 127 || number < -128){
            throw new ByteSizeException();
        }
    }

    public static void main(String[] args) {
        try{
            foo(129);
        }catch (ByteSizeException e) {
            e.printStackTrace();
        }
    }
}
