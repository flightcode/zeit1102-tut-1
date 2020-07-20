
/**
 * @Elliot Parker
 * @v1.1.0-2020-07-14
 */

import java.util.Scanner;

public class Average {
    int i1;
    int i2;
    int i3;
    double avg;

    public Average() {
        System.out.print("Input 3 numbers: ");
        Scanner input = new Scanner(System.in);
        i1 = input.nextInt();
        i2 = input.nextInt();
        i3 = input.nextInt();
        input.close();
        avg = Math.round((i1 + i2 + i3) / 3);
        System.out.println(avg);
    }
}
