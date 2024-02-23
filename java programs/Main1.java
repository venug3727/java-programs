import CIE.Internals;
import SEE.External;

public class Main1 {
    public static void main(String[] args) {

        int[] internalMarks1 = { 80, 75, 85, 90, 88 }; // Internal marks of 5 courses
        Internals student1 = new Internals("1MS17CS001", "Alice", 5, internalMarks1);

        int[] externalMarks1 = { 75, 70, 80, 85, 78 }; // External marks of 5 courses
        External student1External = new External("1MS17CS001", "Alice", 5, externalMarks1);

        int[] internalMarks2 = { 70, 85, 75, 80, 82 }; // Internal marks of 5 courses
        Internals student2 = new Internals("1MS17CS002", "Bob", 5, internalMarks2);

        int[] externalMarks2 = { 80, 75, 85, 90, 88 }; // External marks of 5 courses
        External student2External = new External("1MS17CS002", "Bob", 5, externalMarks2);

        System.out.println("Final Marks of Student 1:");
        printFinalMarks(student1, student1External);

        System.out.println("Final Marks of Student 2:");
        printFinalMarks(student2, student2External);
    }

    // Method to calculate and print final marks
    public static void printFinalMarks(Internals internals, External external) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internals.internalMarks[i] + external.externalMarks[i];
        }

        System.out.println("Course 1: " + finalMarks[0]);
        System.out.println("Course 2: " + finalMarks[1]);
        System.out.println("Course 3: " + finalMarks[2]);
        System.out.println("Course 4: " + finalMarks[3]);
        System.out.println("Course 5: " + finalMarks[4]);
    }
}
