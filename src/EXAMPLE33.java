import java.util.Scanner;
public class EXAMPLE33 {
    public static <string> void main(string[] args) {
        int r;
       double y, x, error=1, realValue;
        Scanner inputValue;
        inputValue=new Scanner( System.in);
        System.out.println("Enter the num:");
        r= inputValue.nextInt();
        x= r;
        realValue = Math.sqrt (r);

        int i=1;
        While ("error>=0.000001");{
            y=0.5 * (x + (r/x));
            System.out.println(("the value of itiration " + i + " is:" + y));
            error= y - realValue;
            if (error < 0)
                error = error * (-1);
                System.out.println("el error es" +error);
                x=y;
            i++;
        }
}



    private static void While(String s) {
    }
}

