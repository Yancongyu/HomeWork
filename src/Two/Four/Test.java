package Two.Four;

import java.util.Scanner;

/*
1．下列哪些变量名是合法的？Ab?1,  @abc , lname, _int,  $25,  private,  ab*5,  #abc
合法：lname , _int , $25
2． 写出以下表达式的值：
（1） int a = 2,  b = 3,  c;
  c = a / b * 8;
    Answer ; 0
（2） float a = 3.0F,  b;
  b = a / 0;
    Answer : Infinity
（3） double a = 3.0, k;
  Int b = 3, c = 2;
  k = a / c + b / c;
    Answer : 2.5
（4） int a = 3,  b = 6, c;
  c =  (a++) + (++b) + a * 2 + b * 4;
    Answer : 3+7+8+28 = 46
（5） int a = 10, b=3, c;
  c = ((a % b) == 0) ?  ++a * 2:++b * 2;
    Answer : 8
（6） int a = 5,b ;
  b = 5 << 2;
    Answer : 5*2^2 = 20
（7） int a = 0, b = 12345, c = 0xffffffff, d, e, f;
  d = a & b;
  e = a | b;
    f = b & c;
    Answer : 0,12345,12345
3． 写出以下程序的运行结果：
    public class MyTime {
    public static void main (String args[]) {
    float a = 3.25F, b= -2.5F;
    int c , d;
    c = (int) (a * b);
    d = (byte) 386;
    System.out.println(“c=c” + c);
    System.out.println(“d=” +d);
    }
    }
    Answer : c=-8,d=-126
*/
public class Test{
    public static void main(String[]args){
        System.out.println("请输入圆的半径");//在控制台输出双引号中间的话
        Scanner sc = new Scanner(System.in);//用sc接收你在控制台输入的东西
        double r = Double.parseDouble(sc.next());//把sc转化成double型并赋值给r
        double area = 3.14*3.14*r;//计算面积
        System.out.println("圆的面积为" + area);//输出面积
    }
}