import java.util.Scanner;
public class EXAMPLE30 {
    public static void main(String[] argv) {
        int n;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");

            }
            System.out.println(); // Change of line
        }
    }
}

