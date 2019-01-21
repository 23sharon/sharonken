import java.io.*;
import java.util.*;
import java.lang.*;

class Main 
{
	public static void main (String[] args) throws IOException 
	{
	 Scanner ip = new Scanner(System.in);
	 String t=ip.nextLine();
	 int result = Integer.parseInt(t);	
	 int count=0;
	 while(result>0)
	 {
	    count++;
        String input = ip.nextLine();
        input= input.replaceAll("\\W", "");
        StringBuilder rev=new StringBuilder();
        StringBuilder nrml=new StringBuilder();
        nrml.append(input);
        rev.append(input);
        rev=rev.reverse();
        String s1=nrml.toString();
        String s2=rev.toString();
        System.out.println("Case #"+count+":");
        if(s1.equals(s2))
        {
            double ans=Math.sqrt(s1.length());
            double ans1=Math.round(ans);
            if((ans/ans1)==1.0)
             System.out.println(Math.round(ans));
            else
             System.out.println("No magic :("); 
        }
        else
        {
         System.out.println("No magic :(");   
        }
        result--;
	 }
	}
}

