import java.util.Scanner;
class Example14WithError {
    public static void main (String[] argv) {
        float a, b, c;
        float first = 0, second = 0, third = 0;
        Scanner inputValue;
        inputValue = new Scanner (System.in);
        System.out.println ("Please, enter the first value:");
        a = inputValue.nextFloat();
        System.out.println ("Now, please enter the second value:");
        b = inputValue.nextFloat();
        System.out.println ("Last, please enter the third value:");
        c = inputValue.nextFloat();
        if (a < b && a < c) {
            first = a;
        } else {
            if (a > b && a > c) {
                third = a;
            } else {
                second = a;
            }
        }
        if (b < a && b < c) {
            first = b;
        } else {
            if (b > a && b > c) {
                third = b;
            } else {
                second = b;
            }
        }
        if (c < a && c < b) {
            first = c;
        } else {
            if (c > a && c > b) {
                third = c;
            } else {
                second = c;
            }
        }
        System.out.println ("These numbers set in ascendant order: " + first + " , "
                + second + " , " + third);
    }
}
