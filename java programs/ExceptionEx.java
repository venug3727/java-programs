import java.util.Scanner;

// Exception class for wrong age
class WrongAge extends Exception {
    WrongAge() {
        super("Invalid age provided");
    }
}

// Base class Father
class Father {
    private int age;

    // Constructor with exception handling for age
    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge();
        }
        this.age = age;
    }

    int getAge() {
        return age;
    }
}

// Derived class Son extending Father
class Son extends Father {
    private int sonAge;

    // Constructor with exception handling for son's age
    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAge();
        }
        this.sonAge = sonAge;
    }

    int getSonAge() {
        return sonAge;
    }
}

class ExceptionEx {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("enter father age: ");
            int fAge = sc.nextInt();
            System.out.println("enter son age: ");
            int sAge = sc.nextInt();
            @SuppressWarnings("unused")
            Father father = new Father(fAge);

            // Creating a Son instance with father's age 50 and son's age 25
            @SuppressWarnings("unused")
            Son son = new Son(fAge, sAge);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
