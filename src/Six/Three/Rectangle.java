package Six.Three;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Rectangle extends Shape{
    int Width;
    int height;

    public Rectangle(){}
    public Rectangle(int Width ,int height,String color){
        this.color = color;
        this.Width = Width;
        this.height = height;
    }

    public double getArea(){
        return Width * height;
    }
    public double getPer(){
        return 2 * (Width + height);
    }
    public void showAll(){
        System.out.println("矩形面积为" + getArea() + "\t周长为" + getPer() + "\t颜色为" + getColor());
    }
}
