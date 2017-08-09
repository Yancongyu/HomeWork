package HHJdbc;

import HHJdbc.dao.OpEmpTestDao;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        OpEmpTestDao oetd = new OpEmpTestDao();
        oetd.showEmp();
//        ArrayList<EmpTest>  arr = new ArrayList();
//        arr.add(new EmpTest(1,"哈哈","哈哈哦"));
//        arr.add(new EmpTest(2,"哈哈哈","哈哈哦哈"));
//        arr.add(new EmpTest(3,"哈","哈哦"));
//        OpEmpTestDao oetd = new OpEmpTestDao();
//        oetd.insertEmp(arr);
    }
}
