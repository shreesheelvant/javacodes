import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int heads=0;
        int tails=0;
        int count=1;
        double random=0.0;
        System.out.println("Enter the number");
        Scanner n = new Scanner(System.in);
        int flips =n.nextInt();
        while (count <= flips) {
            random = Math.random();
            System.out.println(count + "" + random);
            if (random < 0.5) {
                heads++;
                System.out.println("heads");
            } else {
                tails++;
                System.out.println("tails");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of heads:" +heads);
        System.out.println("Number of tails:" +tails);
        double headspercent = (double)heads/flips*100;
        double tailspercent = (double)tails/flips*100;
        System.out.println("percentage of head:" +headspercent);
        System.out.println("percentage of tail:" +tailspercent);
    }
}





