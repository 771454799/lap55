/**
 * Created by mashatel on 11/13/2022.
 */
package sample;

public class C {
    private int c;
    public C()
    {
        c=0;
    }
    public void setC(){
        c=c;
    }
    public int getC()
    { return c;}
    public int undo()
    {
        if (Math.max(c,0)==c&&c!=0)
        {
            c=c-1;
            return c;

        }
        else return 0;
    }

    public static void main(String[] args) {
        C c1=new C();
        c1.getC();
        c1.setC();
        c1.undo();
        System.out.println();
    }
}

