import java.io.PrintWriter;
import java.util.Scanner;
 
class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int K = 0;
    while ((K = sc.nextInt()) != 0) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      while (K > 0) {
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X == N || Y == M) {
          out.println("divisa");
        } else if (X > N) {
          if (Y < M) 
          {
            out.println("SE");
          } else {
            out.println("NE");
          }
        } else {
          if (Y < M) {
            out.println("SO");
          } else {
            out.println("NO");
          }
        }
        K--;
      }
    }
    out.close();
    sc.close();
  }
 
}

