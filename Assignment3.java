/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.*;
/**
 *
 * @author siddh_000
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);
     System.out.print("Enter amount: ");
     double amount = s.nextDouble();
     while(true)
     {
      System.out.print("Enter rate: "); 
      double rate = s.nextDouble();
      if (rate > 100)
      {
          System.out.println("Invalid input: Rate must be <=100 ");
          continue;
      }
      if(rate < 0)
              {
                 System.out.println("Invalid input: Rate must be positive "); 
                 continue;
              }
     
     System.out.print("Enter number of months: "); 
       double months =   s.nextInt();
       System.out.printf("%-12s%10s%20s\n","Month","Interest earned","Account Balance");
       double accountBalance=0;
       for(double i=0;i<months;i++)
       {
       double interest = (amount+accountBalance)*(1+(rate/1200));
       double interestEarned= interest-(amount+accountBalance);
       accountBalance =(amount+accountBalance)+interestEarned;
       System.out.printf("%-12.0f%15.2f%20.2f\n",(i+1),interestEarned,accountBalance);
       }
       break;
     }
   } 
}
