public class ConstructorDemo {
    //method
    public void doSomething(){
        System.out.println("Doing something");

    }
    //explicit constructor->default constructor
    public ConstructorDemo(){
        System.out.println("explicit  constructor called");
        x=100;
        y=200;
    }




    //parameterized constructor
    public ConstructorDemo(int x, int y){


}
    //instance vars
    int x;
    int y;

    int a;
    int b;

    
    public int addNumbers(){
        return x+y;
    }
    public int addNums(){
        return a+b;
    }



    
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //create constructor-implicit constructor will be created
        ConstructorDemo obj= new ConstructorDemo();
        ConstructorDemo obj_new= new ConstructorDemo();

        System.out.println("sum of numbers:"+obj.addNumbers());
        System.out.println("sum of numbers:"+obj.addNums());


        System.out.println("sum of values:"+obj_new.addNumbers()());

    }
    
    





