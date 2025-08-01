package six_class_obj_met;

public class ActualCars {
    public static void main(String[] args) {
    
        CarFactory cretaCar=new CarFactory();
        cretaCar.carBrand="Hyundai";
        cretaCar.carPrice=20.50;
        cretaCar.carReviews=410;
        cretaCar.carRating=4.6;
        cretaCar.displayCar_shortInfo();
        cretaCar.displayCar_completeInfo();

        CarFactory scarpioCar=new CarFactory();
        scarpioCar.carBrand="Mahindra";
        scarpioCar.carPrice=17.71;
        scarpioCar.carReviews=490;
        scarpioCar.carRating=4.7;
        scarpioCar.displayCar_shortInfo();
        scarpioCar.displayCar_completeInfo();

        
}
}
