package Chjdbc;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Emptest {
    private int empno;
    private String ename;

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;

    public Emptest(){}

    public Emptest(int empno,String ename,String job){
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

}
