import java.util.*;
import java.lang.*;
import java.io.*;

class kth_smallest_Array 
{
    public static Scanner scn = new Scanner(System.in);
    
    //1st Approach
    
    /*public static void kthSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    } */
    
    //2nd Approach
    
    public static int findKthLargest(int[] arr, int k) 
    {
	   if (k < 1 || arr == null) 
	   {
		  return 0;
	   }
 
	   return getKth(arr.length - k +1, arr, 0, arr.length - 1);
    }
 
    public static int getKth(int k, int[] arr, int start, int end)
    {
 
	   int pivot = arr[end];
 
	   int left = start;
	   int right = end;
 
       while (true)
	   {
 
		  while (arr[left] < pivot && left < right) 
		  {
			left++;
		  }
 
		  while (arr[right] >= pivot && right > left) 
		  {
			right--;
		  }
 
		  if (left == right) 
		  {
			break;
		  }
 
		  swap(arr, left, right);
	   }
 
	   swap(arr, left, end);
 
	   if (k == left + 1) 
	   {
		return pivot;
	   } 
       else if (k < left + 1)
	   {
		return getKth(k, arr, start, left - 1);
	   } 
	   else 
	   {
		return getKth(k, arr, left + 1, end);
	   }
}
 
public static void swap(int[] arr, int n1, int n2) {
	int tmp = arr[n1];
	arr[n1] = arr[n2];
	arr[n2] = tmp;
}
    
    
	public static void main (String[] args) 
	{
	    int tc = scn.nextInt(); //no. of test cases input
	   
	   	
	   	while(tc > 0)
	   	{
	   	    int  n = scn.nextInt(); //size of an array
	   	    int[] arr = new int[n]; 
		    for(int i = 0; i < arr.length; i++)
		    {
		        arr[i] = scn.nextInt();
		    }
		    int k = scn.nextInt(); //kth element
		
	     	System.out.println(getKth(k,arr,0,arr.length-1));
	     	tc--;
	   	}
	}
}