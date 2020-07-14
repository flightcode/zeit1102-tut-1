/**
 * @Elliot Parker
 * @v1.0.0-2020-07-14
 */

import java.util.Scanner;

public class Largest
{
    int i1;
    int i2;
    int i3;
    public Largest()
    {
        System.out.print("Input 3 numbers: ");
        Scanner input = new Scanner(System.in);
        i1 = input.nextInt();
        i2 = input.nextInt();
        i3 = input.nextInt();
        if(i1 > i2) 
        {
            if (i1 > i3) 
            {
                System.out.println(i1);
            } else 
            {
                System.out.println(i3);
            }
        } else if(i2 > i3) 
        {
            System.out.println(i2);
        } else
        {
            System.out.println(i3);
        }
    }
}
