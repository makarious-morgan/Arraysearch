import java.util.Arrays;
import java.util.Scanner;
public class Arraysearch
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] scores = {85,92,78,96,88};
        int num = sc.nextInt();
        boolean flag =false;
        for (int i =0;i<scores.length;i++)
        {
            if (scores[i]==num)
            {
                System.out.println("Number exists and its index is: " + i);
                flag = true;
            }

        }
        if(!flag)
            System.out.println("Number doesn't exist ");



    }
}
