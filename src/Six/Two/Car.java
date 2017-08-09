package Six.Two;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Car extends Vehicle{
    int loader;

    public Car(){}
    public Car(String brand,String color,double speed, int loader){
        super(brand, color, speed);
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println("轿车正在跑");
    }

    public int getLoader(){
        return loader;
    }
}
