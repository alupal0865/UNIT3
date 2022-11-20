import java.util.Scanner;
class EXAMPLE25 {
    public static void main(String[] argv) {
        int n,mult;
        System.out.println("Enter a number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();
        for (int i = 1; i <= 10; i++) {
            mult = n * i;
            System.out.println (n + " x “ + I + " + " = " + mult);
        }
    }
}
