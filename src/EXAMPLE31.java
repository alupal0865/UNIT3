import java.util.Scanner;
class Example31 {
    public static void main(String[] argv) {
        System.out.println("Type a decimal number <10");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i,     //iterations
                i2,//Slashes
                i3;//Numbers

        for(i=1;i<=number;i++) {
            //first left side slashes
            for (i2 = number; i2 > i; i2--) {
                System.out.print("/ ");
            }
            //n...3,2,1 left side of the pyramid
            for (i3 = i; i3>=1; i3--) {
                System.out.print(i3 + " ");
            }
            //2,3,4...n right side of the pyramid
            for(i3=2;i3<=i;i3++){
                System.out.print(i3+" ");
            }
            //right side slashes
            for (i2=number;i2>i;i2--) {
                System.out.print("/ ");
            }
            System.out.println(" ");
        }
    }
}