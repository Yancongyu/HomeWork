package ChContainer.Four;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/7/14.
 */
public class DateBase {
    Student s;
    static Map<Integer,Student> map;

    public DateBase(){
        map = new HashMap<Integer, Student>();
    }

    public void selectStudent(){
        System.out.println("请输入学号");
        int id = Util.sc.nextInt();
        if(map.get(id) == null){
            System.out.println("学号不为空");
        }
        else{
            System.out.println("学号为" + map.get(id).getStudent_id() + "的学生\t姓名为：" + map.get(id).getStudent_name() + "\t年龄为：" + map.get(id).getStudent_age());
        }
    }
    public void selectAll(){
        System.out.println("学号：\t姓名：\t年龄：");
        System.out.println("----------------------");
        Set set = map.keySet();
        for(Object o : set){
            System.out.println("学号：" + map.get(o).getStudent_id() + "\t姓名：" + map.get(o).getStudent_name() + "\t年龄：" + map.get(o).getStudent_age());
        }
    }
    public void insertStudent(){
        s = new Student();
        s.setStudent_id(get_id());
        System.out.println("请输入姓名");
        s.setStudent_name(Util.sc.next());
        System.out.println("请输入年龄");
        s.setStudent_age(Util.sc.nextInt());
        map.put(s.getStudent_id(),s);
        System.out.println("插入成功");
    }
    public void updateStudent(){
        System.out.println("请输入要修改的学生学号");
        int i = Util.sc.nextInt();
        if(map.get(i) == null){
            System.out.println("不存在这个学生");
        }
        else{
            System.out.println("请输入姓名");
            s.setStudent_name(Util.sc.next());
            System.out.println("请输入年龄");
            s.setStudent_age(Util.sc.nextInt());
            System.out.println("学号为：" + map.get(i).getStudent_id() + "\t姓名" + map.get(i).getStudent_name() + "\t年龄" + map.get(i).getStudent_age());
            System.out.println("更新成功");
        }
    }
    public void deleteStudent(){
        System.out.println("请输入要删除的学生学号");
        int i = Util.sc.nextInt();
        if(map.get(i) == null){
            System.out.println("不存在这个学生");
        }
        else{
            map.remove(i);
            System.out.println("删除成功");
        }
    }
    public int get_id(){
        Set set = map.keySet();
        Object[] o = set.toArray();
        if(o.length == 0){
            return 1;
        }
        else {
            return (Integer)(o[o.length-1]) + 1;
        }
    }
}
