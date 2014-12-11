import java.util.Scanner;

public class HW6Q5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = 3;
    int[][] box = new int[n][n];
System.out.println("Input 9 integers: the first integer input will correspond to the top left corner of the box, the remaining integers will fill the box from left to right");

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        int num = s.nextInt();
        box[i][j] = num;
      }
    }

    // calculating diagonal sums
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < n; i++) {
      sum1 += box[i][i];
      sum2 += box[i][n-i-1];
    }

    int correctSum = (int)(Math.pow(n,3) + 3) / 2;
    if(sum1 == sum2 && sum1 == correctSum) {
      System.out.println("magic box");
    }
   else {
      System.out.println("not a magic box");
    }
  }
}