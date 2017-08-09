package Seven.Two;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Test {
    public static void bijiao(String a, String b) throws NullPointerException{
        try{
            if(a.equals(b)){
                System.out.println("两个字符一样");
            }
            else if(a == null || b == null){
                throw new NullPointerException();
            }
            else{
                System.out.println("两个字符不一样");
            }
        }
        catch(NullPointerException n){
            throw n;
        }
    }
    public static void main(String []args){
        try{
            String a = "1";
            String b = null;
            new Test().bijiao(a,b);
        }
        catch(NullPointerException n){
            System.out.println("有空值");
        }
    }
}
