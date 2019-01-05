import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
 
    while (sc.hasNextInt()) {
      double H = sc.nextInt();
      double U = sc.nextInt();
      double D = sc.nextInt();
      double F = sc.nextInt();
      if (H == 0)
        break;
 
      double decrease = U * (F * 1.0 / 100);
      double current = 0;
      boolean first = true;
      int day = 0;
      while (current <= H && (first || current >= 0)) {
        day++;
        current += U;
        if (current > H)
          break;
        current -= D;
        U -= decrease;
        U = Math.max(U, 0);
        first = false;
      }
      if (current <= 0) {
        out.println("failure on day " + day);
      } else {
        out.println("success on day " + day);
      }
      out.flush();
    }
 
    out.close();
    sc.close();
  }
}

