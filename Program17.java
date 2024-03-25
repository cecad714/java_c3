import java.util.Scanner;

class Employee {
    String empID;
    String eName;
    double salary;
    String address;

    public Employee(String empID, String eName, double salary, String address) {
        this.empID = empID;
        this.eName = eName;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String department;
    String[] subjectsTaught;

    public Teacher(String empID, String eName, double salary, String address, String department, String[] subjectsTaught) {
        super(empID, eName, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    void display() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: $" + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught:");
        for (String subject : subjectsTaught) {
            System.out.println(" - " + subject);
        }
        System.out.println();
    }
}

public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int numTeachers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Teacher[] teachers = new Teacher[numTeachers];

        for (int i = 0; i < numTeachers; i++) {
            System.out.println("\nEnter the details of Teacher " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            String empID = scanner.nextLine();

            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Number of Subjects taught: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // consume newline

            String[] subjectsTaught = new String[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                subjectsTaught[j] = scanner.nextLine();
            }

            teachers[i] = new Teacher(empID, eName, salary, address, department, subjectsTaught);
        }

        System.out.println("\nDetails of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        scanner.close();
    }
}
