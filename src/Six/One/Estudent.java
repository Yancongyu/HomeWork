package Six.One;

/**
 * Created by Administrator on 2017/6/25.
 */
public class Estudent extends Student{
    double reScore;
    double fiScore;
    double midScore;
    double mScore;

    public Estudent(){}
    public Estudent(int id, String name, String sex, int age, double reScore, double fiScore, double midScore){
        super(id,name,sex,age);
        this.reScore = reScore;
        this.fiScore = fiScore;
        this.midScore = midScore;
    }

    public void setReScore(double reScore){
        this.reScore = reScore;
    }
    public void setMidScore(double midScore){
        this.midScore = midScore;
    }
    public void setFiScore(double fiScore){
        this.fiScore = fiScore;
    }

    public double calcScore(){
        this.mScore = 0.5 * reScore + 0.25 * fiScore + 0.25 * midScore;
        return mScore;
    }
}
