import java.util.Scanner;
public class EXAMPLE10 {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println ("type the number: ");
            number = input.nextInt();

            if (number >=0) {
                System.out.println("Positive");
            } else System.out.println("Negative");
    }
}



