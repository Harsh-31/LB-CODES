import java.util.*;
import java.util.Scanner;
public class Max_Min
{
    public static Scanner scn = new Scanner(System.in);

    public static void maximum(int[] arr)
    {
        int max = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum is: " + max);
    }

    public static void minimum(int[] arr)
    {
        int min = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum is: " + min);
    }



    public static void main(String[] args)
    {
        int[] arr = new int[5];
        System.out.println("Enter the elements in array:");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        maximum(arr);
        minimum(arr);
    }
}
