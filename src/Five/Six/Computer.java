package Five.Six;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Computer {
    private char color;
    private int cpu;

    public Computer(){}
    public Computer(char color, int cpu){
        this.color = color;
        this.cpu = cpu;
    }

    public void show(){
        System.out.println("笔记本的信息为\n" + "颜色" + color + " " + "cpu为" + cpu);
    }
}
