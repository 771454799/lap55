/**
 * Created by mashatel on 11/13/2022.
 */
public class Tall {
    private int limet,click;
    public Tall()
    {
        limet=0;
        click=0;
    }
    public void setClick(int click)
    {
       this.click=click;
    }
    public void setLimet(int m)
    {
        limet=m;
    }
    public int getResut()
    {
        if (Math.max(click,limet)==click)
        {
            return click;
    }
    else  return limet;


}
    public static void main(String[] args) {
        Tall t1=new Tall();
        t1.getResut();
        t1.setClick(100);
        t1.setLimet(200);
        t1.getResut();
        System.out.println();



    }
}
