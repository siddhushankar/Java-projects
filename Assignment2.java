/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.*;
/**
 *
 * @author siddh_000
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);
     System.out.print("Enter a 3 digit number: ");
        int number = s.nextInt(); 
        int digit1= number/100;
        int remainder1= number%100;
        int digit2=remainder1/10;
        int remainder2=remainder1%10;
    System.out.println("The number in reverse order = "+remainder2+digit2+digit1);
   //SECOND PART
     System.out.print("\nEnter cost of the movie ticket: ");
     double cost = s.nextDouble();
     System.out.print("Enter rating of the movie recieved out of 5:");
     int rating = s.nextInt();
    if ( (cost < 5) || ( cost < 12 && rating == 5 ) )
    {
      System.out.println("Interest level : Very interested");  
    }
    else if (cost >= 12)
    {
        System.out.println("Interest level : Not interested");
    }
    else if ((cost >= 5 && cost <= 11.99) || (rating >= 2 && rating <= 4))
    {
      System.out.println("Interest level : Sort of interested");  
    }
   else
    {
        System.out.println("Interest level : Not interested");
    }
    }
    
}
