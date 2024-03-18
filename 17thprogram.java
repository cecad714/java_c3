import java.util.Scanner;
class Employee {
	int empID;
	String eName;
	double salary;
    	String Address;

	public Employee(int empID, String eName, double salary, String Address) {
        this.empID = empID;
        this.eName = eName;
        this.salary = salary;
	this.Address = Address;
    }
}

class Teacher extends Employee{
	
	String Dept;
	String[] SubTaught;

	public Employee(int empID, String eName, double salary,String Address, String Dept, String[] SubTaught  ) {
        super(empID, eName, salary, Address);
        this.Dept = Dept;
	this.SubTaught = SubTaught;
	
	void display(){
	System.out.println("Employee ID:" + empID);
	System.out.println("Employee Name:" + eName);
	System.out.println("Salary:" + salary);
	System.out.println("Address:" + Address);
	System.out.println("Department:" + Dept);
	System.out.print("Subjects Taught:" );
	for(String subject : subjectsTaught){
		System.out.println(" - " + SubTaught);	
		}
	System.out.println();

	}

    }
	
}

public class 17thprogram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of teacher: ");
        int n = scanner.nextInt();
        
        Teacher[] teacher = new Teacher[n];

