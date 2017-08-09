package Six.Two;

/**
 * Created by Administrator on 2017/6/25.
 */
public class VehicleTest {
    public static void main(String[]args){
        double speed = 0;
        Vehicle v = new Vehicle("benz","black",speed);
        v.run();
        System.out.println(v.getBrand() + " " + v.getColor() + " " + v.getSpeed());
    }
}
