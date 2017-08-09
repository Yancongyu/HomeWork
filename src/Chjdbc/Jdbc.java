package Chjdbc;

import java.sql.*;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Jdbc {
    private Connection con = null;
    private Statement stm = null;
    private String url = "jdbc:oracle:thin:@localhost:1521:Yan";
    public Jdbc(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            con = DriverManager.getConnection(url,"scott","tiger");
            System.out.println("con输出成功");
            stm = con.createStatement();
            System.out.println("stm建立成功");
        } catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            if(con == null | stm == null)Close();
        }
    }
    public ResultSet Query(String strSQL){
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(strSQL);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            if(rs == null)Close();
        }
        return rs;//something different
    }
    public void Oprate(String strSQL){
        try {
            stm.executeUpdate(strSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void Close(){
        try{
            if(stm != null){
                stm.close();
                System.out.println("stm关闭成功");
            }
            if(con != null){
                con.close();
                System.out.println("con关闭成功");
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
