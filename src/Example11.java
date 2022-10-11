import java.util.Scanner;
import java.util.Arrays;
public class Example11 {
        public static void main(String[] args) {
            int[] arr=new int [2];
            System.out.print ("Enter two numbers: ");
            Scanner sc = new Scanner (System.in);
            for(int i=0; i<2; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.print ("Ascending order: ");
            for(int i=0; i<2; i++) System.out.print(arr[i]+" ");
        }
}

