import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nos = new ArrayList<Integer>();
        int n=0;
        while (in.hasNext()) {
            n = in.nextInt();
            nos.add(n);
            Collections.sort(nos);
            int s=nos.size();
            if(s==1)
            System.out.println(nos.get(0));
            else if(s%2==0)
            {
                System.out.println((nos.get(s/2-1)+nos.get(s/2))/2);
            }
            else
            {
System.out.println(nos.get(s/2));
            }
        }

    }
}
