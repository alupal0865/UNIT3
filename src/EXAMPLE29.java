import java.util.Scanner;
class EXAMPLE29 {
    public static void main(String[] argv) {
        int dividend,divisor;
        System.out.println("Enter dividend:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        dividend = inputValue.nextInt();
        System.out.println("Enter divisor:");
        divisor = inputValue.nextInt();
        while (dividend >= divisor) {
            dividend = dividend - divisor;
        }
        System.out.println(dividend);
    }
}
