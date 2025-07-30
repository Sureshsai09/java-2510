public class Demo {
    public static void main(String[] args) {
        int num1=10;
        double num2=num1;
        System.out.println("original value:" +num1);
        System.out.println("after casting:" +num2);

        double num3=3.14;
        int num4=(int)num3;
        System.out.println("original value:" +num3);
        System.out.println("converted value:" +num4);

        //incompartible conversions
        int zip=500081;
        //String num_num5= (String)zip;//cant cast from str to int
        String str_zip=String.valueOf(zip);
        System.out.println("original val:" +zip);
        System.out.println("converted val:" +str_zip);
        System.out.println(str_zip+5);//conc//str and int can be concatenated

        String str_zip2="five lakh eighty one";
        int num_zip2=Integer.parseInt(str_zip2);
        System.out.println("original val:" +str_zip2);
        System.out.println("converted val:" +num_zip2);
        System.out.println(num_zip2+5);//conc//str and int can be concatenated
        

        //might not be possible
       // int num6=100;
       // boolean boolVal= (boolean)num6;


        






    }
}