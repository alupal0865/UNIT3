import java.util.Scanner;
public class EXAMPLE15 {
    public static void main(String[] argv) {
        int x;
        System.out.println("Enter grades:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();
        if (x < 3) {
            System.out.println("Very deficient");
        } else {
            if (x < 5) {
                System.out.println("insufficient");
            } else {
                if (x < 6) {
                    System.out.println("Enough");
                } else {
                    if (x < 7) {
                        System.out.println("Good");
                    } else {
                        if (x < 9) {
                            System.out.println("Notable");
                        } else {
                            System.out.println("Outstanding");
                        }
                    }
                }
            }
        }
    }
}
