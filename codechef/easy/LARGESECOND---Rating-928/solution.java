import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            
            int firstmax =   Integer.MIN_VALUE;
            int secondmax =   Integer.MIN_VALUE;
            
            for(int i =0; i< n ; i++){
                if(a[i]>firstmax){
                    secondmax =firstmax;
                    firstmax = a[i];
                    
                }
                else if(a[i]>secondmax && a[i]< firstmax){
                    secondmax=a[i];
                }
            }
            int sum = firstmax + secondmax ;
            
            System.out.println(sum);
            
        }
        scanner.close();
    }
}
