package six_class_obj_met;


public class Bank {
    double currentBalance;

    public void greetCustomer(){
        System.out.println("Welcome to the Bank!");

    }
    
    public void depositAmount(double amount){
        currentBalance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdrawAmount(double amount){
        if(amount <= currentBalance){
            currentBalance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
        public double getcheckBalance(){
        return currentBalance;
    }
}
