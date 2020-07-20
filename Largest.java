
/**
 * @Elliot Parker
 * @v1.0.0-2020-07-14
 */

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        System.out.print("Input 3 numbers: ");
        Scanner input = new Scanner(System.in);
        int i1 = input.nextInt();
        int i2 = input.nextInt();
        int i3 = input.nextInt();
        input.close();
        if (i1 > i2) {
            if (i1 > i3) {
                System.out.println(i1);
            } else {
                System.out.println(i3);
            }
        } else if (i2 > i3) {
            System.out.println(i2);
        } else {
            System.out.println(i3);
        }
    }
}
