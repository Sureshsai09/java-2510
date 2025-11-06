package six_class_obj_met;


public class RunBank {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        
        myBank.greetCustomer();
        
        myBank.depositAmount(500.0);
        System.out.println("Current Balance: " + myBank.getcheckBalance());
        
        myBank.withdrawAmount(200.0);
        System.out.println("Current Balance: " + myBank.getcheckBalance());
        
        myBank.withdrawAmount(400.0); // This should show insufficient balance
        System.out.println("Current Balance: " + myBank.getcheckBalance());
    }
}