import java.util.Scanner;
import java.math.BigDecimal;
import java.lang.Math;



public class HW5Q5BigDecimal
{
   public static void main ( String [] args )
   {
      Scanner in = new Scanner (System.in);
      Scanner user_input = new Scanner( System.in );
   
   
      //double r = in.nextDouble();
      BigDecimal e, E, sum, fact, t, one;
      int n = 11;  
      sum = new BigDecimal(0.0);
      fact = new BigDecimal(1);
      double r = 1;
      E = new BigDecimal(1);
      e = new BigDecimal(2.71828182845904523536); 
      t = new BigDecimal(0.00000000010000);
      one = new BigDecimal(1.0);
     
   
      for (int i = 0; i < 35; i++)
      {
         if (E.abs().doubleValue() > t.doubleValue())
         {        
            fact = Factorial(i);
            sum = sum.add((one.divide(fact, 100, BigDecimal.ROUND_FLOOR)));
         //System.out.println(sum);
            E = (sum.subtract(e));
           
            System.out.println("term: " + i + " " + "Sn: " + sum + " " + "Error: " + E.abs());    
         }
         else{
         
            System.out.println("E < 10^10");
         
         }
      
      }
   }

   public static BigDecimal Factorial(int n) {  
      BigDecimal fact;
      fact = new BigDecimal(1.0);  
      if(n==0) 
         return new BigDecimal(1.0); 
      else{ 
         for(int i = 1; i<=n; i++){ 
            fact = fact.multiply(new BigDecimal(i));
         } 
         return fact; 
      }
   }

}

