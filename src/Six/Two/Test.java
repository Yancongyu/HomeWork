package Six.Two;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Test {
    public static void main(String[]args){
        double speed = 10.0;
        Car c = new Car("Honda","red",speed,2);
        c.run();
        System.out.println(c.getBrand() + " " + c.getColor() + " " + c.getSpeed() + " " + c.getLoader());
        c.setSpeed(20.0);
        System.out.println(c.getSpeed());
    }
}
