package fifth_control_stmts;
import java.util.Scanner;


public class LoopsDemo {
    public static void main(String[] args) {
        //loops are for repeated actions
        System.out.println("Hello");

        //without loops
        
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");
            System.out.println("Hi");

               //say hi 10 times -with loops -automated
               //using for loop
                for(int i=1;i<=10;i++){
                    System.out.println( i);
                }

                //reverse direction
                for(int i=5;i>=1;i--){
                    System.out.println( i);
                }

                //break scenario-exit the loop
                for(int i=1;i<=10;i++){
                    //stop when i is 6
                    if(i==6){
                        break;
                    }
                    System.out.println( i);
                }

                //continue scenario-skip the current iteration
                for(int i=1;i<=10;i++){
                    //skip when i is 3

                    if(i==3){
                        continue;
                    }
                    //return to the loop
                    System.out.println( i);

                    
                

    }


    //while loop-runs block of code ,as long as condition is true
    //while syntax
    //while(condition){
        //code to be executed
    //}
    //infinite loop
    //while(true){
        //System.out.println("Hello");
    //}

    //using scanner class
    System.out.println("Enter ur age:");
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age<18){
        System.out.println("minor");
    }else{
        System.out.println("you can vote");
    }

    //read text
    System.out.println("Enter ur name:");
    String name=sc.next();
    System.out.println("Hello "+name);

    // //simulate while loop
    // System.out.println("welcome,Do  you want to continue?yes/no");
    // String choice=sc.next();
    // while(choice.equals("yes")){
    //     System.out.println("you are in the loop");
    //     System.out.println("Do you want to continue?yes/no");
    //     choice=sc.next();
        
    // }

    //while
    int count=1;
    while(count<=5){
        System.out.println("hi:"+count);
        count++;
    }

    //do while
    do{
        System.out.println("hello:"+count);
        count++;
    }while(count<=5);


    }










}

