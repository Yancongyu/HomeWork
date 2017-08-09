package Fifth.Second;

/**
 * Created by Administrator on 2017/6/24.
 */
public class MyDate{
    private int year,month,day;
    public void MyDate(){}
    public void setYear(int year){this.year = year;}
    public void setMonth(int month){this.month = month;}
    public void setDay(int day){this.day = day;}
    public int getYear(){return year;}
    public int getMonth(){return month;}
    public int getDay(){return day;}
    public String toString(){return year + "年" + month + "月" + day + "日";}
}
