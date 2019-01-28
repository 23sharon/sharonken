
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.io.InputStreamReader;
class Main 
{
    public static void main (String [] abc) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) 
		{
			LinkedList<Character> value=new LinkedList<>();
			int p=0;
			for (char c : s.toCharArray()) 
			{
				if (c=='[') 
				    p=0;
				else if (c==']') 
				    p=value.size();
				else 
				    value.add(p++,c);
			}
			StringBuilder sb=new StringBuilder();
			for (char c : value) 
			sb.append(c);
			System.out.println(sb.toString());
		}
	}
}

