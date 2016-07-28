/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;


/**
 *
 * @author siddh_000
 */
public class Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%-12s%15s%15s\n","Sales","Commission Rate","Commission");
        java.util.Random r = new java.util.Random( );
        double[]sales=new double[10];
        double[]commission1=new double[10];
        for(int i=0;i<sales.length;i++)
        {
            double k= r.nextInt(10001);
            sales[i]=k;
        }
       
      
        for(int j=0;j<sales.length;j++)
        {
        double sales1=0;
        sales1=sales[j];
        double commissionRate=computeCommissionRate(sales1);
        double commission=(sales1*commissionRate)/100;
        commission1[j]=commission;
        System.out.printf("$%-12.2f%-20.1f$%-20.2f\n",sales1,commissionRate,commission);
        }
        
        double maxSales=computeMax(sales);
        System.out.println("\nMax Sales = $"+maxSales);
        double maxCommission=computeMax(commission1);
        System.out.println("Max Commission = $"+maxCommission);
    }
         
    public static double computeCommissionRate(double k)
         {
          double commission=0;
          if (k<1000)
          {
              commission=5;
          }
             else if(k>=1000 && k<5000)
                  {
                    commission=10; 
                  }
            else
                  {
                      commission=15;     
                          }
              return commission;
         }
     public static  double computeMax ( double [] arr)
     {
     double max;int s;
     double min=0;
      max=arr[0];
      for(s=1;s<arr.length;s++)
      {
          if (arr[s]>max)
          {
              max=arr[s];
             
          }
          else
          {
              min=arr[s];
          }
      }
      return max; 
      }
}
