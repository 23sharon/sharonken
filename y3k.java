import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
        int n,d,m,y;
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
        n=in.nextInt(); 
        d=in.nextInt(); 
        m=in.nextInt(); 
        y=in.nextInt(); 
        if(n==0 && d==0 && m==0 && y==0)
        break;
        GregorianCalendar ca=new GregorianCalendar(y,m-1,d);
        ca.add(Calendar.DATE,n);
        System.out.println(ca.get(Calendar.DATE)+" "+(ca.get(Calendar.MONTH)+1)+" "+ca.get(Calendar.YEAR));
        
        }
    }
}
