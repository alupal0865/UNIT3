public class EXAMPLE27 {
    public static void main(String [] argv) {
        int i, a, b, c;
        i = 1;
        a = 0;
        b = 1;
        while (i <= 40) {
            c = a;
            a = b + a;
            b = c;
            System.out.println(c);
            i = i + 1;

        }
    }
}

