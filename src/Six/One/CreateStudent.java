package Six.One;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/25.
 */
public class CreateStudent{
    public CreateStudent(){}

    public void create(){
        Student[] s = new Student[5];
        System.out.println("请输入5个学生数据");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            int a = (int)(Math.random()*3);
            switch (a){
                case 0:
                    Estudent e1 = new Estudent();
                    e1.setId(sc.nextInt());
                    e1.setName(sc.next());
                    e1.setSex(sc.next());
                    e1.setAge(sc.nextInt());
                    e1.setReScore(sc.nextDouble());
                    e1.setMidScore(sc.nextDouble());
                    e1.setFiScore(sc.nextDouble());
                    System.out.println("英语学生"+e1.getName() + "\t的学号是" + e1.getId() + "\t性别是" + e1.getSex() + "\t年龄是" + e1.getAge() + "\t分数是" + e1.calcScore());
                    break;
                case 1:
                    Cstudent c = new Cstudent();
                    c.setId(sc.nextInt());
                    c.setName(sc.next());
                    c.setSex(sc.next());
                    c.setAge(sc.nextInt());
                    c.setdScore(sc.nextDouble());
                    c.seteScore(sc.nextDouble());
                    c.setMidScore(sc.nextDouble());
                    c.setFiScore(sc.nextDouble());
                    System.out.println("计算机学生" + c.getName() + "\t的学号是" + c.getId() + "\t性别是" + c.getSex() + "\t年龄是" + c.getAge() + "\t分数是" + c.calcScore());
                    break;
                case 2:
                    Lstudent l = new Lstudent();
                    l.setId(sc.nextInt());
                    l.setName(sc.next());
                    l.setSex(sc.next());
                    l.setAge(sc.nextInt());
                    l.setReScore(sc.nextDouble());
                    l.setwScore(sc.nextDouble());
                    l.setMidScore(sc.nextDouble());
                    l.setFiScore(sc.nextDouble());
                    System.out.println("文学学生" + l.getName() + "\t的学号是" + l.getId() + "\t性别是" + l.getSex() + "\t年龄是" + l.getAge() + "\t分数是" + l.calcScore());
                    break;
            }
        }
        for(int i = 0 ; i < 4 ; i++){
            s[i].show();
        }
    }
}
