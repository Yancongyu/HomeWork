package HHJdbc.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Jdbc {
    private static String url;
    private static String user;
    private static String pwd;

    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Properties p = new Properties();
        File f = new File("H:\\jdbc.properties");
        if(f.exists()){
            InputStream is;
            try {
                is = new FileInputStream(f);
                p.load(is);
                url = p.getProperty("url");
                user = p.getProperty("user");
                pwd = p.getProperty("pwd");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static Connection getConnection(){
        Connection con = null;
        //String url = "jdbc:oracle:thin:@localhost:1521:Yan";
        try {
            con = DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void Close(ResultSet rs, Statement st,Connection con){
        try{
            if(rs != null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
