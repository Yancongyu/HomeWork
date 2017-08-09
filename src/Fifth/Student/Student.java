package Fifth.Student;

/**
 * Created by Administrator on 2017/6/24.
 */
public class Student{
    private String name;
    private int id;
    private double score;

    public Student(){}
    public Student(String name,int id ,double score){this.name = name;this.id = id;this.score = score;}

    public void setName(String name){this.name = name;}
    public void setId(int id){this.id = id;}
    public void setScore(double score){this.score = score;}

    public String getName(){return name;}
    public int getId(){return id;}
    public double getScore(){return score;}

   public void sortByScore(Student[] students){
       double max = students[0].getScore();
       for(int i = 0 ; i < students.length ; i++){
           for(int j = 0 ; j < students.length ; j++){
               if(students[i].getScore() > students[j].getScore()){
                   Student s = students[i];
                   students[i] = students[j];
                   students[j] = s;
               }
           }
       }
       System.out.println("排序之后是");
       for(int i = 0 ; i < students.length ; i++){
           System.out.print(students[i].getName() + " " + students[i].getId() + " " + students[i].getScore() + "\n");
       }
   }
}
