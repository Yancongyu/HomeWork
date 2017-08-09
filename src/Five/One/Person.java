package Five.One;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(){}
    public Person(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void sayHello(){
        System.out.println("Hello mt name is " + name);
    }
}
