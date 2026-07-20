/*Question 2: Employee Salary Analysis
Problem Statement: Store employee salaries and find highest salary.
Guidelines:- Variables to create: double[] salaries- Methods to create: findHighestSalary() */ 
import java.util.Scanner;
class Employee{
  public static double findHighestSalary(double salaries[]){
    double ans=salaries[0] ;
    int n = salaries.length ;
    for(int i =1 ; i<n ; i++){
      if(salaries[i] > ans){
        ans = salaries[i];
      }
    }
          return ans;

  }

  public static void main(String[] Args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of employees salaries : ");
    int num = sc.nextInt();
    double[] salaries = new double[num]; 
    
    for(int i =0 ; i<num ; i++){
      System.out.print("Enter salary "+(i+1)+" : ");
      salaries[i] = sc.nextDouble();
    }
    double maxsal = findHighestSalary(salaries);
    System.out.print("The maximum salary is : "+maxsal);
     sc.close();


  }

}