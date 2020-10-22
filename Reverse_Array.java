import java.util.Scanner;
 public class Reverse_Array
 {
     public static Scanner scn = new Scanner(System.in);
     
     /* public static void reverse(int[] arr, int n)
     {
         int s = 0;
         int e = arr.length - 1;
         while(s <= e)
         {
                 int temp = arr[s];
                 arr[s] = arr[e];
                 arr[e] = temp;
                 s++;
                 e--;
         }
     }

     public static void print(int[] arr, int n)
     {
         reverse(arr,n);
         for(int i = 0; i < n; i++)
         {
             System.out.print(arr[i] + " ");
         }
     }


     public static void main(String[] args)
     {
         int n = scn.nextInt();
         int[] arr = new int[n];
         for(int i = 0; i < n; i++)
         {
             arr[i] = scn.nextInt();
         }

         print(arr,n);
         
     } */



     public static void reverse(char[] arr)
     {
         /*int s = 0;
         int e = str.length() - 1;
         while(s <= e)
         {
             char ch1 = str.charAt(s);
             char ch2 = str.charAt(e);
             
             char temp = ch1;
             ch1 = ch2;
             ch2 = temp;
             s++;
             e--;
         } */
         
         
         int s = 0;
         int e = arr.length - 1;
         while(s <= e)
         {
             char temp = arr[s];
             arr[s] = arr[e];
             arr[e] = temp;
             s++;
             e--;
         } 
     }

     public static void print(char[] arr)
     {
         reverse(arr);
         for(int i = 0; i < arr.length; i++)
         {
             System.out.print(arr[i] + "");
         }
     }


     public static void main(String[] args)
     {
         String str = scn.nextLine();
         char[] arr = str.toCharArray();
         print(arr);
         
         
     }
 }