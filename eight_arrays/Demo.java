public  class Demo {
    public static void main(String[] args) {
        int[] nums=new int[5];
        String[] names=new String[3];
        // store values in arrays
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
        //reassign values
        nums[0]=100;
        //index range is out
        nums[10]=100;






        System.err.println(nums[0]);
        System.err.println(nums[1]);


        //use length on arrays
        System.out.println("length of Numbers:"+(nums.length));
        System.out.println("length of Names:"+(names.length));

        //access all elements inside elements inside an array using loop
        for(int i=0;i<nums.length;i++){
            System.out.println("Elements  "+nums[i]);
        }

            // create array
            int[] numbers={1,2,3,4,5};
            //access all elements inside an array using loop
            for(int j=0;j<numbers.length;j++){
                System.out.println("Elements  "+numbers[j]);

        }
        int[] nuim={1,2,3,4,5};
        int sum=0;
        int avg=0;

        //calculating sum of all individual numbers inside this arrasy
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];//0+1+2+3+4+5--->15
            avg=sum/numbers.length;


        }
        System.out.println("Sum of all numbers:"+sum);
        System.out.println("Average of all numbers:"+avg);

}
}
