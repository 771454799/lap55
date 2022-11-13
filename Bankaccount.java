/**
 * Created by mashatel on 11/13/2022.
 */
public class Bankaccount {
    private double b;

    public void setB(double amount)
    {
        b=b+amount;

    }
    public void setwinter(double amount){
        b=b-amount;
    }
    public void get_renaining()
    {
        System.out.println(b);
    }
    public void addinterst(){
        double rate=((b+10)/100);
                b=b+rate;
    }
    public static void main(String[] args) {
        Bankaccount b1=new Bankaccount();
        b1.setB(1000);
        b1.setwinter(500);
        b1.setwinter(400);
        b1.get_renaining();
        System.out.println("exeptec result="+100);
        b1.setB(900);
        b1.addinterst();
        b1.get_renaining();
        System.out.println("expted reslt="+1100);

    }

}

