public class Testt {
    public static void main(String[] args) {
        int[][] numTwoDim=new int[3][2];//3rows 2columns
        numTwoDim[0][0]=10;
        numTwoDim[0][1]=20;
        numTwoDim[1][0]=30;
        numTwoDim[1][1]=40;
        numTwoDim[2][0]=50;

        int[][] numTwoDIm={{10,20},{30,40},{50,60}};
        for(int i=0;i<numTwoDIm.length;i++){
            int[] rows=numTwoDIm[i];
            for(int j=0;j<rows.length;j++){
                System.out.print(rows[j]);
            }
            System.out.println();
        }


    }
    
}
