package HHJdbc.beans;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/19.
 */
public class EmpTest implements Serializable{
    private int empno;
    private String ename;
    private String job;

    public EmpTest(){}
    public EmpTest(int empno, String ename,String job){
        this.empno = empno;
        this.ename = ename;
        this.job = job;
    }

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
}
