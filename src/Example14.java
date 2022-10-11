import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Example14 {
    public static void main(String[] args) {
        int[] arr=new int [3];
        out.print ("Enter three numbers: ");
        Scanner sc = new Scanner (in);
        for(int i=0; i<3; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        out.print ("Ascending order: ");
        for(int i=0; i<3; i++) {
            out.print(arr[i] + " ");
        }
    }
}
