package ChCollection.Two;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Mailtest {
        public  boolean  testMail(){
            Scanner in =  new  Scanner(System. in );
            String s = in.next();
            if (s.indexOf( "@" )==-1||s.indexOf( "." )==-1)
            {
                System. out .println( " 邮箱地址中不包含 @ 或 ." );
                return   false ;
            }
            if (s.indexOf( "@" )!=s.lastIndexOf( "@" )||s.indexOf( "." )!=s.lastIndexOf( "." ))
            {
                System. out .println( " 邮箱地址中含有多了 @ 或 ." );
                return    false ;       }
            if (s.indexOf( "@" )>s.lastIndexOf( "." )) {
                System. out .println( " 邮箱地址中 . 出现在 @ 的前面 " );
                return   false ;
            }
            for ( int  i=0;i<s.indexOf( "@" );i++){
                if ( (s.charAt(i)>= 'a' &&s.charAt(i)<= 'z' )||(s.charAt(i)>= 'A' &&s.charAt(i)<= 'Z' ) ){                    }
                else {           System. out .println( " 用户名里有其他字符 " );
                    return   false ;
                }
            }
            return   true ;
        }
    }
