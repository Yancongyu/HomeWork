package Six.Two;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Vehicle {
    private String brand;
    private String color;
    private double speed;

    public Vehicle(){}
    public Vehicle(String brand, String color, double speed){
        this.brand = brand;
        this.color = color;
        speed = 0.0;
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public void run(){
        System.out.println("汽车正在跑");
    }
}
