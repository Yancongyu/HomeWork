package Fifth.Student;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Test {
    public static void main(String[]args){
        Student s1 = new Student("张三",1,59);
        Student s2 = new Student("张四",2,62);
        Student s3 = new Student("张五",3,20);
        Student[] students = new Student[]{s1,s2,s3};
        new Student().sortByScore(students);
    }
}
