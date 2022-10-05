import java.util.Scanner;
public class EXAMPLE7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters, nautical_miles;
        System.out.print("enter the value of miles: ");
        nautical_miles = in.nextDouble();
        in.nextLine();
        meters=nautical_miles*1852;
        System.out.println("meter value: " + meters);
    }
}
