package Seven.Six;

/**
 * Created by Administrator on 2017/7/9.
 */
public class ByteSizeException extends Exception{
    public ByteSizeException(){
        super("此数字超出byte数据类型表示的数的范围");
    }
}
