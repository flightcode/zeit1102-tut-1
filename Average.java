import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.print("Input 3 numbers: ");
        Scanner input = new Scanner(System.in);

        int i1 = input.nextInt();
        int i2 = input.nextInt();
        int i3 = input.nextInt();
        input.close();
        double avg = Math.round((i1 + i2 + i3) / 3);
        System.out.println(avg);
    }
}
