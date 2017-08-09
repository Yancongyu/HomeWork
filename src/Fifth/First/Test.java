package Fifth.First;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public static void main(String[]args){
        MyTime m = new MyTime();
        m.setHour(12);
        m.setMinute(55);
        m.setSecond(50);

        m.getHour();
        m.getMinute();
        m.getSecond();

        System.out.println(m.toString());
    }
}
