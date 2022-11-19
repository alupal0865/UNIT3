import java.util.Scanner;
public class EXAMPLE18 {
    public static void main(String[] argv){
        Scanner input= new Scanner(System.in);
        double hours, price, gross, taxes, netPay;
        System.out.println("Enter hours: ");
        hours = input.nextDouble();
        System.out.println("Enter price of hour: ");
        price = input.nextDouble();

        if (hours > 35) {
        gross =35 * price +(hours - 35) * price * 1.5;
        } else {
        gross =hours * price;
        }
        System.out.println("Gross salary= + gross");
        taxes =0;
        if (gross > 500) {
            if (gross > 900) {
        taxes =400 * 0.25 + (gross-900) * 0.45;
        } else {
        taxes = (gross -500) * 0.25;
            }
        }
        netPay = gross - taxes;
        System.out.println("Taxes= " + taxes);
        System.out.println("Net Pay= " + netPay);
    }
}
