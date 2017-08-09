package Five.Five;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Circle {
    private static final double pi = 3.14;
    int radius;

    public Circle(){}
    public Circle(int r){
        this.radius = r;
    }

    public void findArea(){
        System.out.println("面积是" + pi * radius * radius);
    }
}
