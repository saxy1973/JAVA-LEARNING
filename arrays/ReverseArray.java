/* Question 7: Reverse Array
Problem Statement: Reverse elements of array.
Guidelines:- Variables to create: int[] arr- Methods to create: reverseArray() */
import java.util.Scanner;
public class ReverseArray {
  public static void Reverse(int[] arr){
    int left = 0;
    int right = arr.length - 1;
    while(left < right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
    System.out.print("[ ");
    for(int i =0 ;i<arr.length ; i++){
      System.out.print(" "+arr[i]+" ");
    }
    System.out.print(" ]");
  }
  public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n ; i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("Orginal Array : ");
         for(int i =0 ; i<n ; i++){
          System.out.print("[ "+arr[i]+" ");
        }
        System.out.print(" ]");
        Reverse(arr);

 }
  
}
