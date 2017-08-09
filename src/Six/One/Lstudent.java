package Six.One;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Lstudent extends Student{
    double reScore;
    double wScore;
    double midScore;
    double fiScore;
    double mScore;

    public Lstudent(){}
    public Lstudent(int id, String name, String sex, int age, double reScore, double wScore, double midScore, double fiScore){
        super(id,name,sex,age);
        this.reScore = reScore;
        this.wScore = wScore;
        this.midScore = midScore;
        this.fiScore = fiScore;
    }

    public void setReScore(double reScore){
        this.reScore = reScore;
    }
    public void setwScore(double wScore){
        this.wScore = wScore;
    }
    public void setMidScore(double midScore){
        this.midScore = midScore;
    }
    public void setFiScore(double fiScore){
        this.fiScore = fiScore;
    }

    public double calcScore(){
        this.mScore = 0.35 * reScore + 0.35 * wScore + 0.15 * fiScore + 0.15 * midScore;
        return mScore;
    }
}
