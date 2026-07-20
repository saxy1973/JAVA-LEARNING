/*Question 3: Attendance Counter
Problem Statement: Count number of present students.
Guidelines:- Variables to create: int[] attendance- Methods to create: countPresent( */
public class AttendanceCounter {
  public static int countPresent(int[] attendance){
    int p = 0 ;
    for(int i =0 ;i < attendance.length ; i++){
      if(attendance[i]==1){
        p++;
      }
    }
    return p;

  }

  public static void main(String[] Args){
    int attendance[] = {1,0,1,0,0,1,0,0,1,1,1,1,1,1,1,0,1,1,0};
    int count = countPresent(attendance);
    System.out.print("Number of student present : "+count);

  }
  
}
