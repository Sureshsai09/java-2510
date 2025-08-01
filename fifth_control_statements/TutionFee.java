public class TutionFee {

    public static void main(String[] args) {
    //inputs
    int studentGradeLevel=10;
    double baseTutionFee=30000.0;
    double  discountPercentage=0.0;
    boolean academicTopperStatus=true;

    //using conditional statements to determine the discount percentage
    if(studentGradeLevel>=9 && studentGradeLevel<=12){
        if(academicTopperStatus){
            discountPercentage=20.0;
        }
        else{
            discountPercentage=10.0;
        }
    }
    else if (studentGradeLevel>=6 && studentGradeLevel<=8){
        discountPercentage=5.0;
    }
    else if(studentGradeLevel<6) {
        discountPercentage=0.0;
    }
    if (studentGradeLevel==10) {
        discountPercentage +=3.0;
    }
    else if (studentGradeLevel==12) {
        discountPercentage +=5.0;

        
    }
    double discountAmount=baseTutionFee - (baseTutionFee+discountPercentage/100.0);


    System.out.println("Student's Grade level:"+studentGradeLevel);
    System.out.println("Base Tution Fee: $"+baseTutionFee);
    System.out.println("Discount Percentage: "+discountPercentage+"%");
    System.out.println("Tution Fee after discount: $"+discountAmount);
        
    }

        
    }
        


    
        


    



