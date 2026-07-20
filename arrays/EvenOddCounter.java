/* Question 4: Even Odd Counter
Problem Statement: Count even and odd numbers.
Guidelines:- Variables to create: int[] numbers- Methods to create: countEvenOdd()  */
import java.util.Scanner;
public class EvenOddCounter {
  public static void Evencounter(int[] arr){
    int even = 0;
    int zero = 0;
    int odd = 0;
    for(int i =0 ; i<arr.length ; i++){
      if(arr[i]==0){
        zero++;
      }
      else if(arr[i]%2==0){
          even++;
      }
      else{
        odd++;
      }
    } 
    System.out.println("even : "+even);
    System.out.println("odd : "+odd);
    System.out.println("zero: "+zero);

  }
  public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arrs[] = new int[n];
    for(int i =0 ; i<n ; i++){
      arrs[i]= sc.nextInt();
    }
    Evencounter(arrs);
     sc.close();

  }
 

  
}
