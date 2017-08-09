package Six.Three;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Circle extends Shape{
    double radius;

    public double getArea(){
        return 3.14 * radius * radius;
    }
    public double getPer(){
        return 2 * 3.14 * radius;
    }
    public void showAll(){
        System.out.println("圆的周长为" + getPer() + "\t面积为" + getArea() + "\t颜色为" + getColor());
    }

    public Circle(){}
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
}
