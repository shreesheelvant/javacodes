public class PowerOfTwo {
    public static void main(String[] args) {
        boolean t = false;
        int n = 4, power = 0, temp = 0;
        while (temp < n) {
            temp = (int) (Math.pow(2, power));
            power++;
            if (temp == n) {
                t = true;
            }
        }
        if (t)
            System.out.println("True");
        else
            System.out.println("false");
    }
}






