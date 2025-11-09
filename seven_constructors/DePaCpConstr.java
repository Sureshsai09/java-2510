package seven_constructors;

class Car {
    String Brand;
    int Year;

    // Default Constructor
    Car() {
        Brand = "Toyota";
        Year = 2020;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Car(String b, int y) {
        Brand = b;
        Year = y;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    Car(Car obj) {
        Brand = obj.Brand;
        Year = obj.Year;
        System.out.println("Copy Constructor Called");
    }
}

public class DePaCpConstr{
    public static void main(String[] args) {
        // Create objects using all constructors
        Car c1 = new Car("BMW", 2021);   // Parameterized
        Car c2 = new Car(c1);            // Copy Constructor
        Car c3 = new Car();              // Default

        System.out.println("\nOutput:");
        System.out.println(c1.Brand + " - " + c1.Year);
        System.out.println(c2.Brand + " - " + c2.Year);
        System.out.println(c3.Brand + " - " + c3.Year);
    }
}
