package seven_constructors;




    class Car {
    String brand;
    int year;

    // Default Constructor
    Car() {
        brand = "Unknown";
        year = 2020;
        System.out.println("Car object created!");
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();  // Constructor runs automatically
        System.out.println(c1.brand + " - " + c1.year);
    }
}

    
