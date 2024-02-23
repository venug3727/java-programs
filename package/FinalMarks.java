import CIE.Student;
import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("\nEnter the number of students");
        int n = s1.nextInt();

        String[] name = new String[n];                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        String[] usn = new String[n];
        int[] sem = new int[n];
        int[][] InternalMarks = new int[n][5];
        int[][] SeeMarks = new int[n][5];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student" + (i + 1) + ":");
            System.out.println("\nName:");
            name[i] = s1.next();
            System.out.println("\nUSN:");
            usn[i] = s1.next();
            System.out.println("\nSem:");
            sem[i] = s1.nextInt();

            System.out.println("Enter internal marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.println("\nCourse" + (j + 1) + ":");
                InternalMarks[i][j] = s1.nextInt();
            }

            System.out.println("Enter See marks for 5 courses:");
            for (int j = 0; j < 5; j++) {
                System.out.println("\nCourse" + (j + 1) + ":");
                SeeMarks[i][j] = s1.nextInt();
            }
        }

        int[][] FinalMarks = new int[n][5];
        for (int i = 0; i < n; i++) {
            Internals I1 = new Internals(name[i], usn[i], sem[i], InternalMarks[i]);
            Externals E1 = new Externals(name[i], usn[i], sem[i], SeeMarks[i]);
		int sum=0;
            for (int j = 0; j < 5; j++) {
                FinalMarks[i][j] = I1.InternalMarks[i] + E1.SeeMarks[j];
            }
            System.out.println("\n\nFinal Marks for " + n + " Student in 5 courses:");
            for (int k = 0; k < n; k++) {
                System.out.println(name[k] + ":");
                for (int j = 0; j < 5; j++) {
                    sum += FinalMarks[i][j];
                }
                System.out.println(sum);
            }
        }
        s1.close();
    }
}
