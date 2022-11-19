import java.util.Scanner;
class EXAMPLE20 {
    public static void main(String[] argv) {
        int year;
        System.out.println("Enter year:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        year = inputValue.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("LEAP year");
                } else {
                    System.out.println("NOT leap year");
                }
            } else {
                System.out.println("LEAP year");
            }
        } else {
            System.out.println("NOT leap year");
        }
    }
}
