import java.util.Scanner;
public class HarmonicNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        double result = 0.0;
        System.out.println("The Harmonic Series is.......");
        while (num > 0) {
            result = result + (double)1/num;
            num--;
            System.out.println(result +" ,");
        }
        System.out.println("The Harmonic number for given num:" + result);
    }
}






