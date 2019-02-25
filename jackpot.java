import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        while((n=in.nextInt())!=0)
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int m=0,c=0;
            for(int y=0;y<n;y++)
            {
             c=Math.max(c+a[y],a[y]);
             m=Math.max(m,c);
            }
            if(m>0)
            {
            System.out.println("The maximum winning streak is "+m+".");
            }
            else
            {
            System.out.println("Losing streak.");
            }
        }
    }
}
