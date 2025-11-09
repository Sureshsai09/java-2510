package seven_constructors
;

class Trainer {
    //  Instance Variables (properties)
    int id;
    String name;
    long phone;
    int age;

    // 1️Default Constructor
    Trainer() {
        // id = 0;
        // name = "Not Assigned";
        // phone = 0;
        // age = 0;
        System.out.println("Trainer Default Constructor Called");
    }

    // 2️Parameterized Constructor (2 parameters)
Trainer(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("Trainer Parameterized Constructor (2 params) Called");
    }

    // 3️Parameterized Constructor (4 parameters)
    Trainer(int id, String name, long phone, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.age = age;
        System.out.println("Trainer Parameterized Constructor (4 params) Called");
    }

    // Method to Display Trainer Details
    //display student info-hovered

public void TrainerInfo() {
        System.out.println("====== Trainer INFO======");
        System.out.println("TrainerID: "+id);
        System.out.println("Trainer Name: "+name);
    
    }
    void TrainerCompleteInfo() {
        System.out.println("====== Trainer INFO======");
        System.out.println("Trainer ID: "+id);
        System.out.println("Trainer Name: "+name);
        System.out.println("Trainer Mobile NO: "+phone);
        System.out.println("Trainer Age: "+age);
    }
}


public class LMSTrainerConstr {
    public static void main(String[] args) {
        // 🔹 Creating 3 objects using different constructors
        Trainer s1 = new Trainer();                         // calls default constructor
        Trainer s2 = new Trainer(101, "Suresh");            // calls 2-param constructor
        Trainer s3 = new Trainer(102, "Ramesh", 9876543210L, 20); // calls 4-param constructor

        // Display results
        System.out.println("\nOutput:");
        System.out.println("Trainer 1 Details: ");
        s1.TrainerInfo();

        System.out.println("\nTrainer 2 Details: ");
        s2.TrainerInfo();

        System.out.println("\nTrainer 3 Details: ");
        s3.TrainerCompleteInfo();
    }
}
