package Fifth.Second;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public static void main(String[]args){
        MyDate m = new MyDate();
        m.setYear(12);
        m.setMonth(55);
        m.setDay(50);

        m.getYear();
        m.getMonth();
        m.getDay();

        System.out.println(m.toString());
    }
}
