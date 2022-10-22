import java.util.Scanner;
public class EXAMPLE32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 1.0;
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        int k;
        for(k = 1; k < 11; k++){
            x = (x + a/x) / 2;
        }
        System.out.println("the root of " + a + " after of " + (k - 1) + " iterations is of " + x);
    }

}