package Six.One;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Cstudent extends Student{
    double dScore;
    double eScore;
    double fiScore;
    double midScore;
    double mScore;

    public Cstudent(){}
    public Cstudent(int id, String name, String sex, int age, double dScore, double eScore, double fiScore, double midScore){
        super(id,name,sex,age);
        this.dScore = dScore;
        this.eScore = eScore;
        this.fiScore = fiScore;
        this.midScore = midScore;
    }

    public void setdScore(double dScore){
        this.dScore = dScore;
    }
    public void seteScore(double eScore){
        this.eScore = eScore;
    }
    public void setMidScore(double midScore){
        this.midScore = midScore;
    }
    public void setFiScore(double fiScore){
        this.fiScore = fiScore;
    }

    public double calcScore(){
        this.mScore = 0.4 * dScore + 0.2 * eScore + 0.2 * fiScore + 0.2 * midScore;
        return mScore;
    }
}
