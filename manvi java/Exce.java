import java.util.Scanner;

class SalaryComparisonException extends Exception {
    public SalaryComparisonException(String message) {
        super(message);
    }
}

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) throws SalaryComparisonException {
        super(name, salary);
        if (salary <= 0) {
            throw new SalaryComparisonException("Manager's salary must be greater than zero.");
        }
    }

    public void setSalary(double salary) throws SalaryComparisonException {
        if (salary <= this.salary) {
            throw new SalaryComparisonException("Manager's salary must be greater than the worker's salary.");
        } else {
            this.salary = salary;
        }
    }
}

class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }
}

public class Exce {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter manager's name: ");
            String managerName = scanner.nextLine();
            System.out.print("Enter manager's salary: ");
            double managerSalary = scanner.nextDouble();
            Manager manager = new Manager(managerName, managerSalary);

            System.out.print("Enter worker's name: ");
            scanner.nextLine(); // Consume newline
            String workerName = scanner.nextLine();
            System.out.print("Enter worker's salary: ");
            double workerSalary = scanner.nextDouble();
            Worker worker = new Worker(workerName, workerSalary);

            System.out.println("Manager's salary: " + manager.getSalary());
            System.out.println("Worker's salary: " + worker.getSalary());

            // Trying to set worker's salary higher than manager's (should throw exception)
            System.out.print("Enter new salary for worker: ");
            double newSalary = scanner.nextDouble();
            worker.setSalary(newSalary);

            scanner.close();
        } catch (SalaryComparisonException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
