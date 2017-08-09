package Five.Seven;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){}
    public Time(int hour, int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour , int minute , int second){
        if((hour >= 0 && hour <= 23) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else{
            System.out.println("你是不是傻");
        }
    }
    public void show(){
        System.out.println("时间是" + hour + "点" + minute + "分" + second + "秒");
    }
}
