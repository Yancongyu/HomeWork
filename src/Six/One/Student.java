package Six.One;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Student{
    private int id;
    private String name;
    private String sex;
    private int age;

    //构造器
    public Student(){}
    public Student(int id, String name, String sex, int age){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //get set
    public void setId(int id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setSex(String sex){this.sex = sex;}
    public void setAge(int age){this.age = age;}

    public int getId(){return id;}
    public String getName(){return name;}
    public String getSex(){return sex;}
    public int getAge(){return age;}

    public void show(){
        System.out.println(" ");
    }

}
