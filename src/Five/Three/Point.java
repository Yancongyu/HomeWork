package Five.Three;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public void movePoint(int dx , int dy){
        this.x = x + dx;
        this.y = y + dy;
    }
    public void show(){
        System.out.println(x + " " + y);
    }

    public static void main(String []args){
        Point p = new Point(1,5);
        p.show();
        p.movePoint(2,5);
        p.show();
    }
}
