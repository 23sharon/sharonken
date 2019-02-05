import java.io.*;
import java.util.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])
    {
        try
        {
           Scanner in=new Scanner(System.in);
            while(true)
            {
              char[] s =in.nextLine().toCharArray();
              if(String.valueOf(s).equals("#"))
              {
              break;
              }
              int k=-1;
              for(int i=0;i < s.length-1;++i)
              {
              if(s[i]<s[i+1])
              k=i;
              }
              if(k==-1)
              {
                  System.out.println("No Successor");
                  continue;
              }
              int l=0;
              for(int i=k+1;i<s.length;++i)
              if(s[k]<s[i])
              l=i;
              char t=s[k];
              s[k]=s[l];
              s[l]=t;
              for(int i=k+1;i<(s.length+k+1)/2;++i)
              {
                  t=s[i];
                  s[i]=s[s.length-i+k];
                  s[s.length-i+k]=t;
              }
              System.out.println(String.valueOf(s));
            }
        }
        catch(Exception e)
        {
          e.printStackTrace();
          System.exit(0);
        }
              
            }
        }

