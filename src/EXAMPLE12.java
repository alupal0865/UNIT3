import java.util.Scanner;
public class EXAMPLE12 {
    public static void main(String[] args)
    {
        int a, b, big;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();

        big = Math.max(a, b);
        System.out.println("\nLargest = " +big);
    }
}
