package daily;
//Student class defining instance and static components
class Student {
 // 1. Instance and Static variables
 int rollNumber;
 String name;
 static String collegeName = "ABC Engineering College";
 static int studentCount = 0;

 // 6. Static initialization block
 static {
     System.out.println("Student class initialized.\n");
 }

 // 2. Parameterized constructor
 public Student(int rollNumber, String name) {
     this.rollNumber = rollNumber;
     this.name = name;
     studentCount++; // Increment count every time an object is created
 }

 // 3. Static method to change college name
 public static void changeCollegeName(String newCollegeName) {
     collegeName = newCollegeName;
     System.out.println("College name updated successfully.\n");
 }

 // 4. Instance method to display student details
 public void displayDetails() {
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Name: " + name);
     System.out.println("College: " + collegeName);
     System.out.println();
 }

 // 5. Static method to display the total student count
 public static void displayStudentCount() {
     System.out.println("Total Students: " + studentCount);
     System.out.println();
 }
}

//Main class to execute the required flow
public class Student_management_static {
 public static void main(String[] args) {
     // 1. Create three student objects individually
     Student s1 = new Student(101, "Rahul");
     Student s2 = new Student(102, "Priya");
     Student s3 = new Student(103, "Amit");

     // 2. Display the initial details of all three students
     s1.displayDetails();
     s2.displayDetails();
     s3.displayDetails();

     // 3. Display the total number of students created (Using Class Name)
     Student.displayStudentCount();

     // 4. Change college name using the static method (Using Class Name)
     Student.changeCollegeName("XYZ Institute of Technology");

     // 5. Display details again to reflect the updated static college name
     s1.displayDetails();
     s2.displayDetails();
     s3.displayDetails();

     // 6. Demonstrate calling the static count method via Class Name again
     Student.displayStudentCount();
 }
}


