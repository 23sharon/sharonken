/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main 
{
	public static void main (String[] args) {
	    Scanner ip=new Scanner(System.in);
	   while(ip.hasNext())
	   {
	   int p=ip.nextInt();                             
	   int q=ip.nextInt();
	   int r=ip.nextInt();
	   int s=ip.nextInt();
	   int t=ip.nextInt();
	   int u=ip.nextInt();
	   double a=Double.valueOf(p);
	   double b=Double.valueOf(q);
	   double c=Double.valueOf(r);
	   double d=Double.valueOf(s);
	   double e=Double.valueOf(t);
	   double f=Double.valueOf(u);
	  
	  double xmin=0.0;
	  double xmax=1.0;
	  double x=0.0;
	  double value=0.0;
	  
			
			double minvalue=a*Math.exp(-xmin)+b*Math.sin(xmin)+c*Math.cos(xmin)+d*Math.tan(xmin)+e*xmin*xmin+f;
			double maxvalue=a*Math.exp(-xmax)+b*Math.sin(xmax)+c*Math.cos(xmax)+d*Math.tan(xmax)+e*xmin*xmax+f;
			if(minvalue>0 && maxvalue<0)
			{
			   for(int i=0;i<50;i++)
			  {
			        x=xmin+xmax/2;
			        value=a*Math.exp(x)+b*Math.sin(x)+c*Math.cos(x)+d*Math.tan(x)+e*x*x+f;
			    if(value<0)
			    {
			     xmax=x;
			    }
		  else if(value>0)
			    {
			    xmin=x;
			    }
		    }
	           
	            System.out.printf("%4f\n",x);
	    }
	            else if(minvalue==0)
 	                {
	                     System.out.println("0.0000");
	                }
	        else if(maxvalue==0)
	            {
	                System.out.println("1.0000");
	            }
	        else{
	                System.out.println("no solution");
	           }
		}
	        }
    }

		
 
	


	        
	        
	        
	        
	        

