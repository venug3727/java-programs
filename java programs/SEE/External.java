package SEE;

import CIE.Student;

public class External extends Student {
    public int[] externalMarks;

    // Constructor
    public External(String usn, String name, int sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }
}
