package Chjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Test {
    public static void main(String[]args){
        Emptest e = new Emptest(56,"嘻嘻","哈哈");
//        try {
//            new OpEmpDao().InsertEmp(e);
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }
        Emptest e1 = new Emptest();
        try {

            ResultSet rs = new OpEmpDao().QueryEmp(e1);
            while(rs.next()){
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.println(rs.getString(3));
            }
            new Jdbc().Close();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }
}
