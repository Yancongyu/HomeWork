package Third.Sixth;

/**
 * Created by Administrator on 2017/6/18.
 */
public class Test {
   public static void main(String[]args){
       for(int i = 101 ; i <= 200 ; i++){
           boolean b = true;
           for(int j = 2 ; j < i ; j++){
               if(i % j == 0){
                   b = false;
                   break;
               }
           }
           if(!b){
               continue;
           }
           System.out.print(i + " ");
       }
   }
}
