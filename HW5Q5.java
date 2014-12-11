import java.util.Scanner;

public class HW5Q5
{
   public static void main ( String [] args )
   {
      Scanner in = new Scanner (System.in);
      Scanner user_input = new Scanner( System.in );
   

      //double r = in.nextDouble();
      int n = 11;  
      double sum = 0;
      double fact = 1;
      double r = 1;
      double E = 1;
      double e = 2.718281829; 
      
     

      for (int i = 0; i <= n; i++)
      {        
         fact = Factorial(i);
         sum += (1/fact);
         //System.out.println(sum);
         E = (sum - e);
         System.out.println("term:" + i + " " + "Sn:" + sum + " " + "Error:" + Math.abs(E));    
      }
   }

   public static float Factorial(int n) {  
      int fact = 1;  
      if(n==0) 
         return 1; 
      else{ 
         for(int i=1; i<=n; i++){ 
            fact = fact * i;
         } 
         return fact; 
      }
   }

}

