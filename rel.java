import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=ip.nextInt(),b=ip.nextInt();
        System.out.println(a < b? "<":a > b? ">" :"=");
        }
            }
}
