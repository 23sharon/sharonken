import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=b.readLine()).equals("0"))
        {
            PriorityQueue<Integer> a=new PriorityQueue<>();
            int n=Integer.parseInt(s);
            StringTokenizer st=new StringTokenizer(b.readLine());
            for(int i=0;i<n;i++)
            a.offer(Integer.parseInt(st.nextToken()));
            int t=0;
            while(!(a.isEmpty()))
{
    int c=a.poll();
    if(!(a.isEmpty()))
    {
        c+=a.poll();
        t+=c;
        a.offer(c);
    }
}            
            System.out.println(t);
        }
    }
}

