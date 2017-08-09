package Chjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/18.
 */
public class OpEmpDao {

    public void InsertEmp(Emptest e) throws SQLException{
        Jdbc j = new Jdbc();
        j.Oprate("insert into emptest values(" + e.getEmpno() + ",'"+e.getEname()+"','"+e.getJob()+"')");
        j.Close();
    }

    public ResultSet QueryEmp(Emptest e)throws SQLException{
        Jdbc j = new Jdbc();
        ResultSet rs = j.Query("select * from emptest");
        return rs;
    }

    public void UpdateEmp(Emptest e) throws SQLException{
        Jdbc j = new Jdbc();
        j.Oprate("Update emptest set ename = '" + e.getEname() +"',job = '" + e.getJob() + "' where empno = " + e.getEmpno());
        j.Close();
    }

    public void DelEmp(int empno) throws SQLException{
        Jdbc j = new Jdbc();
        j.Oprate("delete from emptest where empno = " + empno);
        j.Close();
    }
}
