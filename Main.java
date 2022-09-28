import java.util.Scanner;

/**
 * A single class, with a summing operation inside.
 *
 * @author Myroslava
 * @version 1.0
 */


public class Main {

    public static void main(String[] args) {
        float sum = 0;
        long n = 10;
        long m = 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 start numbers: a and b");
        long a = input.nextLong();
        long b = input.nextLong();
        try{
            for (long i = a; i<=n; i++) {
                for (long j = b; j<=m; j++) {
                    float op = ((float)(i * j) / (i + 2));
                    sum += op;


                }
            }
            System.out.println(sum);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}