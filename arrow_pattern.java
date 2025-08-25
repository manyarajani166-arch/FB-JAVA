import java.util.Scanner;
public class main{
    public static void  main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an odd number greater than 2:");
       int n = sc.nextInt();
       if(n%2 == 0){
           System.out.println("Enter only odd number greater than 2");
       }
       else{
           for (int i = 0; i < n; i++) {
              if(i<n/2){
                for (int j = 0; j <= n; j++) {
                   if(j<1){
                          System.out.print("* ");
                   }
                   else if(j>=1 && j<=n/2){
                          System.out.print("  ");
                   }
                   else if(j>=n/2+1 && j<=n/2+i+1){
                            System.out.print("* ");
                   }
                // System.out.println();
                }
                System.out.println();
            }
            if(i == n/2){
                for (int j = 1; j <= n+1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            if(i > n/2){
                for(int j = 0; j <= n; j++) {
                    if(j<1){
                          System.out.print("* ");
                   }
                   if(j>=1 && j<=n/2){
                          System.out.print("  ");
                   }
                   if(j>=n/2+1 && j< n/2+n-i+1){
                            System.out.print("* ");
                   }
                } 
                System.out.println();
            }
           }
       }
    }
}