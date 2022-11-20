import java.util.Scanner;
class Example28 {
    public static void main(String[] argv) {
        int mult,x,y;
        System.out.println("Enter number 1:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();
        System.out.println("Enter number 2:");
        y = inputValue.nextInt();
        mult = x;
        for (int i = 1; i < y; i++) {
            mult = mult + x;
        }
        System.out.println(mult);
    }
}
