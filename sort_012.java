import java.util.*;
import java.lang.*;
import java.io.*;

class sort012
{
    public static Scanner scn = new Scanner(System.in);
    
    public static void sort012(int[] arr, int n)
    {
        int lo = 0;
        int hi = arr.length-1;
        int mid = 0;
        
    
            while(mid <= hi)
            {
               if(arr[mid] == 0)
               {
                  int temp = arr[lo];
                  arr[lo] = arr[mid];
                  arr[mid] = temp;
                  lo++;
                  mid++;
               }
               else if(arr[mid] == 1)
               {
                  mid++;
               }
               else
               {
                  int temp1 = arr[mid];
                  arr[mid] = arr[hi];
                  arr[hi] = temp1;
                  hi--;
               }
            
           }
    }
    
	public static void main (String[] args) 
	{
	    int tc = scn.nextInt();
	    while(tc > 0)
	    {
	        int n = scn.nextInt();
	        int[] arr = new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            arr[i] = scn.nextInt();
	        }
	        sort012(arr,n);
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        tc--;
	    }
		//code
	}
}