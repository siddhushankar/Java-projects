/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5_gadesiddartha;

/**
 *
 * @author siddh_000
 */
public class A5_GadeSiddartha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.printf("%-6s%12s%17s%15s\n","Name","Sales Amount","Commission Rate","Commission");
       java.util.Random r = new java.util.Random( );
       SalesPerson s1 = new SalesPerson("Fred");
       SalesPerson s2 = new SalesPerson("Bob");
       SalesPerson s3 = new SalesPerson("Jill");
       s1.setsalesAmt(r.nextInt(10001));
       s2.setsalesAmt(r.nextInt(10001));
       s3.setsalesAmt(r.nextInt(10001));
       System.out.println(s1.toString());
       System.out.println(s2.toString());
       System.out.println(s3.toString());
       computeMax(s1,s2,s3);
      String salesPersonBest=computeMax(s1,s2,s3);
      System.out.println("sales person of the month:"+salesPersonBest); 
       
    }
    
    public static String computeMax (SalesPerson s1,SalesPerson s2,SalesPerson s3)
  {
     double max;String name="blank";
     double min=0;
     double salesAmt1=s1.getsalesAmt();
     double commission = s1.computeCommissionRate(salesAmt1);
     double commissionEarned = s1.computeCommission(commission,salesAmt1);
     double salesAmt2=s2.getsalesAmt();
     double commission1 = s2.computeCommissionRate(salesAmt2);
     double commissionEarned1 = s2.computeCommission(commission,salesAmt2);
     double salesAmt3=s3.getsalesAmt();
     double commission2 = s3.computeCommissionRate(salesAmt3);
     double commissionEarned2 = s3.computeCommission(commission,salesAmt3);
     max=commission;
    if ( commissionEarned > commissionEarned1 && commissionEarned > commissionEarned2 )
         name=s1.getName();
      else if ( commissionEarned1 > commissionEarned && commissionEarned1 > commissionEarned2 )
         name=s2.getName();
      else if ( commissionEarned2 > commissionEarned1 && commissionEarned2 > commissionEarned1)
       name=s3.getName();
      else   
         System.out.println("Commissions are equal");
     return name;
  }
    
}


