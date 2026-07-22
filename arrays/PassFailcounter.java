import java.util.Scanner;

public class PassFailCounter {

    public static void countPassFail(int[] marks) {
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 33) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Number of Pass Students : " + pass);
        System.out.println("Number of Fail Students : " + fail);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        countPassFail(marks);

        sc.close();
    }
}