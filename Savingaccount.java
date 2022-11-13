/**
 * Created by mashatel on 11/13/2022.
 */
public class Savingaccount {
    private double b,i;
    public Savingaccount(double intal)
    {
        b=intal;
        i=((b*10)/100);

    }
    public void addinterast()
    {
        b=b+i;
    }
    public void getb()
    {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Savingaccount s1=new Savingaccount(100);
        s1.addinterast();
        s1.getb();
        System.out.println("expetad blanes="+100);
    }
}
