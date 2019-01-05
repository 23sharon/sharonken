
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main{
 
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
 
    while (true) {
      int duration = sc.nextInt();
      double downpayment = sc.nextDouble();
      double loan = sc.nextDouble();
      int depreciations = sc.nextInt();
      if (duration < 0) {
        break;
      }
      double valOfCar = loan + downpayment;
      double monthlyPayment = loan / duration;
 
      int[] depList = new int[depreciations];
      double[] depVal = new double[depreciations];
      for (int i = 0; i < depreciations; i++) {
        depList[i] = sc.nextInt();
        depVal[i] = sc.nextDouble();
      }
 
      int lastMonth = 0;
      double lastVal = depVal[0];
 
      valOfCar *= (1 - lastVal);
 
      if (loan < valOfCar) {
        out.println("0 months");
        continue;
      }
 
      lastMonth = 1;
 
      for (int i = 1; i < depList.length; i++) {
        int nextMonth = depList[i];
        double nextMonthDepreciation = depVal[i];
        while (lastMonth <= nextMonth) {
          if (nextMonth == lastMonth) {
            lastVal = nextMonthDepreciation;
          }
          valOfCar *= (1 - lastVal);
          loan -= monthlyPayment;
          lastMonth++;
          if (loan < valOfCar) {
            break;
          }
        }
        if (loan < valOfCar) {
          break;
        }
      }
      while (loan > valOfCar) {
        valOfCar *= (1 - lastVal);
        loan -= monthlyPayment;
        lastMonth++;
      }
 
      lastMonth--;
      if (lastMonth == 1) {
        out.println("1 month");
      } else {
        out.println(lastMonth + " months");
      }
    }
    out.close();
    sc.close();
  }
 
}

