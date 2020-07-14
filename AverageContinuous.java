/**
 * @Elliot Parker
 * @v1.3.2-2020-07-14
 */

import java.util.Scanner;
import java.lang.Math.*;

public class AverageContinuous
{
    int i;
    int current;
    int x;
    float avg;
    public AverageContinuous()
    {
        System.out.print("Input numbers (-1 to stop): ");
        for(i = -1;current != -1; i++)
        {
            x += current;
            Scanner input = new Scanner(System.in);
            current = input.nextInt();
        }
        avg = (float)x/i;
        System.out.print(avg);
    }
}
