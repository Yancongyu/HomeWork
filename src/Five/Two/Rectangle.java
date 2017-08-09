package Five.Two;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){}
    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    public int getPer(){
        return 2*(length + width);
    }
    public int getArea(){
        return length * width;
    }
    public void showAll(){
        System.out.println("矩形的长为" + length + " " + "宽为" + width + " " + "周长为" + getPer() + " " + "面积为" + getArea());
    }
}
