import sample.Controller;

/**
 * Created by mashatel on 11/14/2022.
 */
public class Contrall {
    private String name;
    private double salartm,raise;
    public Contrall(String employee_name,double currentsalary)
    {
        name=employee_name;
        salartm=currentsalary;
    }
    public String getName()
    {
        return name;
    }
    public double getSalartm()
    {
        return salartm;
    }
    public void setName(double bypercnt)
    {
        raise=((salartm*bypercnt)/100);
        salartm=salartm+raise;
    }

    public static void main(String[] args) {
        Contrall   emp1= new Contrall("tasneem",500);
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalartm());

    }




}
