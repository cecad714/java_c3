import java.util.Scanner;

class Person{
    String Name;
    String Gender;
    String Adrs;
    int Age;

    public Person(String Name, String Gender, String Adrs, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Adrs = Adrs;
        this.Age = Age;
    }
}

class Employee extends Person {
    String empID;
    String CompanyName;
    String Qualification;
    double Salary;
    public Employee(String Name, String Gender, String Adrs, int Age, String empID, String CompanyName, String Qualification, double Salary) {
        super(Name, Gender, Adrs, Age);
        this.empID = empID;
        this.CompanyName = CompanyName;
	this.Qualification = Qualification;
	this.Salary = Salary;
    }
}

class Teacher extends Employee{
    String Sub;
    String Dept;
    String TeacherID;
    public Teacher(String Name, String Gender, String Adrs, int Age, String empID, String CompanyName, String Qualification, double Salary, String Sub, String Dept, String TeacherID) {
        super(Name, Gender, Adrs, Age, empID, CompanyName, Qualification, Salary);
        this.Sub = Sub;
        this.Dept = Dept;
	this.TeacherID = TeacherID;
    }
    void display() {
    	System.out.println("Name: " + Name);
    	System.out.println("Gender: " + Gender);
    	System.out.println("Address: " + Adrs);
    	System.out.println("Age: " + Age);
    	System.out.println("Employee ID: " + empID);
    	System.out.println("Company Name: " + CompanyName);
    	System.out.println("Qualification: " + Qualification);
    	System.out.println("Salary: " + Salary);
    	System.out.println("Subject: " + Sub);
    	System.out.println("Department: " + Dept);
    	System.out.println("Teacher ID: " + TeacherID);

    }
}

public class program18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        scanner.close();
    }
}

