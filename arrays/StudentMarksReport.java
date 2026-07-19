/*Question 1: Student Marks Report
Problem Statement: Store marks of students and calculate average and highest marks.
Guidelines:- Variables to create: int[] marks- Methods to create: calculateAverage(), findMax()*/
import java.util.Scanner;
class StudentMarksReport {
  public static double calculateAverage(int[] marks){
    int sum = 0 ;
    for(int i =0 ; i< marks.length ; i++){
      sum = sum + marks[i];
    }
    double ans = (double)sum / (double)marks.length ; 
    return ans;
  }
  public static int highestmarks(int[] marks){
    int sol= marks[0];
    for(int i = 1 ; i< marks.length ;i++){
      if(sol < marks[i]){
        sol = marks[i];
      }
    }

    return sol;
  }


  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the of marks to be added : ");
    int num = sc.nextInt();
    int[] marks = new int[num];
    for(int i = 0 ; i<num ; i++){
      int n = i+1;
      System.out.print("Marks "+ n +" : ");
      int k = sc.nextInt();
      marks[i] = k;
    }
    
    double avg = calculateAverage(marks);
    int max = highestmarks(marks);

    System.out.println("Average marks : "+ avg);
    System.out.println("Maximum Marks : "+ max);
    
  }
}