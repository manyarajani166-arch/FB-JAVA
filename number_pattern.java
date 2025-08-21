import java.util.Scanner;
public class number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        int h = n;
        int a = 0;
        int g = 0;
        for (int i = 0; i < n; i++) {
            a++;
            h = n;
            g = a-1;
            for (int j = 0; j < n-i; j++) {
                if(j<1){
                    System.out.print(a + " ");
                    g++;
                }
                else if(j>=1 && j<n-i){
                    g = g+h;
                    System.out.print(g + " ");
                    h--;
                }
                
            }
            System.out.println();
        }
    }
}
