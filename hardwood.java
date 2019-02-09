import java.io.*;
import java.util.*;

class Main{
	public static void main (String[] args) throws Exception
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(in.readLine());
	    in.readLine();
	    for(int i=0;i<t;i++)
	    {
	        Map<String,Integer> mp = new TreeMap<>();
	        String s;
	        int l=0;
	        while((s=in.readLine())!=null)
	        {
	            if(s.length()==0)
	                break;
	            if(mp.containsKey(s))      
	                mp.put(s,mp.get(s)+1);
	            else
	            mp.put(s,1);
	            
	            l++;
	        }
	        for(String h:mp.keySet())      
	        System.out.printf("%s %.4f\n",h,mp.get(h)*100.0/l);
	        if(i<t-1)
	        System.out.println();
	    }
	 }
	  
}
