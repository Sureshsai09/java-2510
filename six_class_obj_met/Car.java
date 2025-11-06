package six_class_obj_met;
//types of variables
public class Car {
    //instance variables
    String carBrand;
    int year;
    double carPrice;


    //method to demonstrate local variable
    public void displayCarInfo(){
        //local variable
        String color="BLACK";
        System.out.println("color:"+color);
        System.out.println("car year of manufsacture:"+year);
        System.out.println("car Price:"+carPrice);
    }
    //static variable
    static double globalDiscount=15;


    public static void main(String[] args) {
        System.out.println("=============Car Details=================");
    Car honda=new Car();
    honda.carBrand="Honda";
    honda.year=2020;
    honda.carPrice=4.5;
    
    System.out.println("=============Honda Car=================");
    System.out.println("car brand:"+honda.carBrand);
    System.out.println("car year of manufacture:"+honda.year);
    System.out.println("car Price:"+honda.carPrice+"Lakh");
    honda.displayCarInfo();
    System.out.println("Global Discount on car:"+Car.globalDiscount+"%");



    
    }
    }

    

