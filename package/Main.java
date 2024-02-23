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
            Manager manager = new Manager("John Doe", 5000);
            Worker worker = new Worker("Jane Smith", 3000);

            System.out.println("Manager's salary: " + manager.getSalary());
            System.out.println("Worker's salary: " + worker.getSalary());

            // Trying to set worker's salary higher than manager's (should throw exception)
            worker.setSalary(6000);
        } catch (SalaryComparisonException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
