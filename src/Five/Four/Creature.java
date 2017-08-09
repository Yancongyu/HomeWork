package Five.Four;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Creature {
    String sound;
    public void setSnarl(String creature){
        if(creature.equals("猫")){
            sound = "喵喵";
        }
        else if(creature.equals("狗")){
            sound = "汪汪";
        }
    }
    public void outPut(){
        System.out.println(sound);
    }
}
