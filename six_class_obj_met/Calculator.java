package six_class_obj_met;

public class Calculator {
    //method with no return type and no parameters
    public void greetCalculator(){
        System.out.println("Welcome to the Calculator!");
    }

    //method with return type and parameters
    public String numberType(int num){
        if(num >0){
        return "Postive number";
        } else {
        return "Negative number";
        }
    
    }
    ///method with return type and multiple parameters
    public int addNumbers(int num1, int num2){
        return num1+num2;

    
}
public static void main(String[] args){
    Calculator calObj=new Calculator();
    calObj.greetCalculator();
    System.out.println(calObj.numberType(-10));
    System.out.println(calObj.addNumbers(230, 20));
    // System.out.println(calObj.addNumbers(num1:230, num2:20));
}
}