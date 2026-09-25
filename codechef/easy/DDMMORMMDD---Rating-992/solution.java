import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            
            String[] parts = s.split("/");
            
            int first = Integer.parseInt(parts[0]);
            int secnd = Integer.parseInt(parts[1]);
            
            if (first >12){
                System.out.println("DD/MM/YYYY");
            }
            else if(secnd>12){
                System.out.println("MM/DD/YYYY");
            }
            else{
                System.out.println("BOTH");
            }
            
        }    
    }
}
