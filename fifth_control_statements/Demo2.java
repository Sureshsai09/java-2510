public class Demo2 {
    public static void main(String[] args) {
        int num=-10;
        int age=20;

        //check if given no is postive
        if(num>0){
            System.out.println("Number is positive");
        }
        //check if given no is negative or postive
        if(num>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }

        //vote eligibility
        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not Eligible for voting");

        }

        //vote eligiblity check-ternary operator
        //variable=condition ? value_if_true:value_if_false
        
        String msg=(age>=18)? "Eligible for voting":"Not Eligible for voting";
        System.out.println(msg);

        //else if ladder
        int avg_score=70;
        if(avg_score>=90){
            System.out.println("Grade A");
        }
        else if(avg_score>=80){
            System.out.println("Grade B");
        }
        else if(avg_score>=70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
        //switch case
        int day=3;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            default:
            System.out.println("Invalid day");
            break;
        }
        //nested condition
        int age_verify=21;
        boolean id=true;
        if(age_verify>=18){
            if(id==true){
                System.out.println("Eligible for voting");
            }
            else{
                System.out.println("Not Eligible for voting");
            }
        }
        else{
            System.out.println("Not Eligible for voting");
        }
        

    }

}
