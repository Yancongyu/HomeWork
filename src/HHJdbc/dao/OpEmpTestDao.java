package HHJdbc.dao;

import HHJdbc.beans.EmpTest;
import HHJdbc.jdbc.Jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/19.
 */
public class OpEmpTestDao {
    public List<EmpTest> showEmp(){
        Connection con = Jdbc.getConnection();
        Statement st = null;
        ResultSet rs = null;
        List<EmpTest> arr = new ArrayList<>();

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM emptest");
            while(rs.next()){
                EmpTest e = new EmpTest();
                e.setEmpno(rs.getInt(1));
                e.setEname(rs.getString(2));
                e.setJob(rs.getString(3));
                System.out.print(e.getEmpno() + "\t");
                System.out.print(e.getEname() + "\t");
                System.out.println(e.getJob());
                arr.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Jdbc.Close(rs,st,con);
        }
        return arr;
    }

    public boolean insertEmp(List<EmpTest> emp){
        Connection con = Jdbc.getConnection();
        //预置对象
        PreparedStatement ps = null;
        boolean b = true;
        try {
            ps = con.prepareStatement("INSERT INTO emptest VALUES (?,?,?)");
            for(EmpTest e : emp){
                ps.setInt(1,e.getEmpno());
                ps.setString(2,e.getEname());
                ps.setString(3,e.getJob());
                ps.addBatch();
            }
            int[] nums = ps.executeBatch();
//            for(int n : nums){
//                System.out.println(n);
//            }
            b = true;
        } catch (SQLException e) {
            b = false;
            e.printStackTrace();
        }
        finally {
            Jdbc.Close(null,ps,con);
        }
        return b;
    }
}