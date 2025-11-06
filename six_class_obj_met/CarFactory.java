package six_class_obj_met;

public class CarFactory {
      //data
    String carBrand;
    double carPrice;
    int carReviews;
    double carRating;


//behaviour method task
public void displayCar_shortInfo(){
    //Data ->local Variables
    String description="car can mean low fuel, low tire pressure, maintenance due, literally any malfunction (seatbelt, LED headlamp, airbag, etc) that doesn't throw a check engine light. if you have an orange ⚠️ it's probably not major, but the car either needs something or something isn't working correctly.";
    System.out.println("when hovered: ");
    System.out.println("car Brand:"+carBrand);
    System.out.println("car price:"+carPrice);
    System.out.println("car desc:"+description);

}

public void displayCar_completeInfo(){
    int carInsurance=1;

    // System.out.println("car Brand:"+carBrand);
    // System.out.println("car price:"+carPrice);
    System.out.println("when clickled: ");
    displayCar_shortInfo();//reusing
    System.out.println("car reviews:"+carReviews);
    System.out.println("car rating:"+carRating);
    System.out.println("car Insurance:"+carInsurance + " year");
}
        public void calaulateEMI(int months){
            double emi=carPrice/months;
            System.out.println("EMI for "+months+" months: "+emi);
            
        }
}
