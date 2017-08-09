package Fifth.First;

/**
 * Created by Administrator on 2017/6/24.
 */
public class MyTime{
    private int hour,minute,second;
    public void MyTime(){}
    public void setHour(int hour){this.hour = hour;}
    public void setMinute(int minute){this.minute = minute;}
    public void setSecond(int second){this.second = second;}
    public int getHour(){return hour;}
    public int getMinute(){return minute;}
    public int getSecond(){return second;}
    public String toString(){return hour + "点" + minute + "分" + second + "秒";}
}
