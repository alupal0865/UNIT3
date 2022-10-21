import java.util.Scanner;
public class EXAMPLE34 {
    private static int fact;
    public static void main(String [] argv) {
        Scanner value = new Scanner(System.in);
        System.out.println("enter the number of interactions:x");
        double num;
        num = value.nextDouble();
        for(int x=1; x<=num; x++) {
            for(int n=1; n<=x; n++) {
                fact = fact * n;
            }
        }
        System.out.println("the approximation number e is '2,71828=∑_(n=0)^∞▒1/n!⋯,-∞<x<∞'");
    }
}






