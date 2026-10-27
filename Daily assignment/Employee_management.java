package daily;

//Task 1: Use of this Keyword
class Employee {
 int employeeId;
 String employeeName;
 double salary;

 // Parameterized constructor using 'this' to resolve naming conflicts
 public Employee(int employeeId, String employeeName, double salary) {
     this.employeeId = employeeId;       // 'this.employeeId' refers to the instance variable
     this.employeeName = employeeName;   // 'employeeName' refers to the local parameter
     this.salary = salary;
 }

 // Task 3 (Base Method): final method that cannot be overridden
 public final void calculateBonus() {
     double bonus = this.salary * 0.10;
     System.out.println(employeeName + "'s calculated 10% bonus: ₹" + bonus);
 }

 public void displayDetails() {
     System.out.println("Employee ID   : " + employeeId);
     System.out.println("Employee Name : " + employeeName);
     System.out.println("Salary        : ₹" + salary);
     System.out.println("-----------------------------------");
 }
}

//Task 2: Use of final Variables
class Company {
 // final variables initialized and uppercase by naming convention
 public final String COMPANY_NAME = "Tech Solutions Pvt. Ltd.";
 public final int MAX_EMPLOYEES = 100;

 public void displayCompanyInfo() {
     System.out.println("Company Name   : " + COMPANY_NAME);
     System.out.println("Max Employees  : " + MAX_EMPLOYEES);
     System.out.println("-----------------------------------");
 }
}

//Main execution class
public class  Employee_management {
 public static void main(String[] args) {
     // Task 2 execution
     Company myCompany = new Company();
     myCompany.displayCompanyInfo();

     // Task 1 execution: Create two employee objects
     Employee emp1 = new Employee(101, "Aarav Sharma", 75000.0);
     Employee emp2 = new Employee(102, "Ishita Roy", 90000.0);

     // Display details and execute final method calculation
     emp1.displayDetails();
     emp1.calculateBonus();
     System.out.println();

     emp2.displayDetails();
     emp2.calculateBonus();
 }
}


