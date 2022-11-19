import java.util.Scanner;
class EXAMPLE17 {
    public static void main(String[] argv) {
        int h,m,s;
        System.out.println("Enter H,M,S:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        h = inputValue.nextInt();
        m = inputValue.nextInt();
        s = inputValue.nextInt();
        s = s + 1;
        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
            }
        }
        System.out.println("H: "+h+" M: "+m+ " S: "+s);
    }
}
