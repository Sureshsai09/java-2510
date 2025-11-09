package seven_constructors;
class Student {
    //  Instance Variables (properties)
    int id;
    String name;
    long phone;
    int age;

    // 1️Default Constructor
    Student() {
        // id = 0;
        // name = "Not Assigned";
        // phone = 0;
        // age = 0;
        System.out.println("Student Default Constructor Called");
    }

    // 2️Parameterized Constructor (2 parameters)
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("Student Parameterized Constructor (2 params) Called");
    }

    // 3️Parameterized Constructor (4 parameters)
    Student(int id, String name, long phone, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
        System.out.println("Student Parameterized Constructor (4 params) Called");
    }

    // Method to Display Student Details
    //display student info-hovered

public void studentInfo() {
        System.out.println("====== STUDENT INFO======");
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
      //  System.out.println("ID: " + id + " | Name: " + name + " | Phone: " + phone + " | Age: " + age);
    }
    void studentCompleteInfo() {
        System.out.println("====== STUDENT INFO======");
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Mobile NO: "+phone);
        System.out.println("Student Age: "+age);
    }
}


public class LMSConstr {
    public static void main(String[] args) {
        // 🔹 Creating 3 objects using different constructors
        Student s1 = new Student();                         // calls default constructor
        Student s2 = new Student(101, "Suresh");            // calls 2-param constructor
        Student s3 = new Student(102, "Ramesh", 9876543210L, 20); // calls 4-param constructor

        // Display results
        System.out.println("\nOutput:");
        System.out.println("Student 1 Details: ");
        s1.studentInfo();

        System.out.println("\nStudent 2 Details: ");
        s2.studentInfo();

        System.out.println("\nStudent 3 Details: ");
        s3.studentCompleteInfo();
    }
}
