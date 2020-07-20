import java.util.Scanner;

public class AverageContinuous {
    public static void main(String[] args) {
        int current = 0;
        int x = 0;
        int i;

        System.out.println("Input numbers (-1 to stop): ");
        for (i = -1; current != -1; i++) {
            x += current;
            Scanner input = new Scanner(System.in);
            current = input.nextInt();
            input.close();
        }
        float avg = (float) x / i;
        System.out.println("Average: " + avg);
    }
}
