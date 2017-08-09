package ChThread.First;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Account {
    private String id;
    private double account;

    public Account(){}
    public Account(String id, double account){
        this.account = account;
        this.id = id;
    }

    public String getId(){
        return id;
    }
    public double getAccount(){
        return account;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setAccount(double account){
        this.account = account;
    }

    public synchronized void deposit(double a){
        account += a;
    }
    public synchronized void withdraw(double a){
        account -= a;
    }

    public double checkBalance(){
        return account;
    }
}
