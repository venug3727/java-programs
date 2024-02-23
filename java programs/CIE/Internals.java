package CIE;

public class Internals extends Student {
    public int[] internalMarks;

    // Constructor
    public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }
}
