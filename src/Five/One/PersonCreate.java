package Five.One;

/**
 * 1.C
 * 2.E
 *3.ABCE
 *4.A
 *5.C
 *6.C
 *7. pi PersonCreate c = new PersonCreate(); c.radius
 *8.第六行：调用非静态变量需要声明，第二十五行同上
 *9.static block
 non-static block
 aaaaaaaaaaaa
 non-static block
 aaaaaaaaaaaa
 Hello my name isZhangsan
 Hello my name isZhangsan
 */
public class PersonCreate {
    public  static void main(String []args){
        Person p = new Person("zhangsna" , 33 , 1.73);
        Person p1 = new Person("lishi" , 44 , 1.74);

        p.sayHello();
        p1.sayHello();
    }
}