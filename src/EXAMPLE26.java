import java.util.Scanner;
class Example26 {
    public static void main(String[] argv) {
        int n;
        System.out.println("Enter a number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
