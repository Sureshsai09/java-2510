public class Demo1 {
    public static void main(String[] args) {
        // arithmetic operators
        int num1=10;
        int num2=5;
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder: "+remainder);
         // increment and decrement operators
        int a = 10;
        System.out.println("Value of num4 before increment: "+a);
        System.out.println("++A:"+ ++a);//pre
        System.out.println("++A:"+ a++);//post
       // a++;
        //System.out.println("Value of num4 after increment: "+a);
       // a--;
        System.out.println("Value of num4 after decrement: "+a);
        System.out.println("--A:"+ --a);//pre
        System.out.println("A--:"+ a--);//post
        

        //compound assignment operators
        int num3=10;
        num3+=5;
        System.out.println("num3: "+num3);
        num3-=5;
        System.out.println("num3: "+num3);
        num3*=5;
        System.out.println("num3: "+num3);
        num3/=5;
        System.out.println("num3: "+num3);
        num3%=5;
        System.out.println("num3: "+num3);

        // int num3 = 10;
        // num3 += 5;
        // System.out.println("Value of num3 after addition: "+num3);
        // num3 -= 5;
        // System.out.println("Value of num3 after subtraction: "+num3);
        // num3 *= 5;
        // System.out.println("Value of num3 after multiplication: "+num3);
        // num3 /= 5;
        // System.out.println("Value of num3 after division: "+num3);
        // num3 %= 5;
        // System.out.println("Value of num3 after modulus: "+num3);


        // relational operators(copmarision)
        int num5=10;
        int num6=20;
        System.out.println("num5>num6: "+(num5>num6));
        System.out.println("num5<num6: "+(num5<num6));
        System.out.println("num5==num6: "+(num5==num6));
        System.out.println("num5!=num6: "+(num5!=num6));
        System.out.println("num5>=num6: "+(num5>=num6));
        System.out.println("num5<=num6: "+(num5<=num6));
        
        
        // logical operators
        boolean b1=true;
        boolean b2=false;
        System.out.println("b1&&b2: "+(b1&&b2));
        System.out.println("b1||b2: "+(b1||b2));
        System.out.println("!(b1||b2): "+!(b1||b2));
        System.out.println("!(b1&&b2): "+!(b1&&b2));
        System.out.println("b1^b2: "+(b1^b2));
        System.out.println("b1&b2: "+(b1&b2));
        System.out.println("b1|b2: "+(b1|b2));

        //bitwise operators
        int num7=5;//
        int num8=3;//
        int resultand=num7 &num8;
        System.out.println("resultand: "+resultand);
        int resultor=num7|num8;
        System.out.println("resultand: "+resultand);
        int resultxor=num7^num8;
        System.out.println("resultxor: "+resultxor);
        int resultnot=num7^num8;
        System.out.println("resultnot: "+resultnot);
        int resultleftshift=num8<<3;
        System.out.println("resultleftshift: "+resultleftshift);
        int resultrightshift=num8>>2;
        System.out.println("resultrightshift: "+resultrightshift);
        
        
        

        // System.out.println("num7&num8: "+(num7&num8));
        // System.out.println("num7|num8: "+(num7|num8));
        // System.out.println("num7^num8: "+(num7^num8));
        // System.out.println("num7<<num8: "+(num7<<num8));
        // System.out.println("num7>>num8: "+(num7>>num8));
        // System.out.println("~num7: "+(~num7));



        
    }
}
