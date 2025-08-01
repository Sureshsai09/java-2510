package six_class_obj_met;

public class CarFactory {
      //data
    String carBrand;
    double carPrice;
    int carReviews;
    double carRating;






//behaviour method task
public void displayCar_shortInfo(){
    System.out.println("when hovered: ");
    System.out.println("car Brand:"+carBrand);
    System.out.println("car price:"+carPrice);

}

public void displayCar_completeInfo(){
    System.out.println("car Brand:"+carBrand);
    System.out.println("car price:"+carPrice);
    System.out.println("when clickled: ");
    displayCar_shortInfo();//reusing
    System.out.println("car reviews:"+carReviews);
    System.out.println("car rating:"+carRating);
}

}
