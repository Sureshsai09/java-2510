package fifth_control_stmts;
//variables -data types -operators-type casting-conditional-stmts-loops
import java.util.Scanner;

public class LMSDemo {
    public static void main(String[] args) {
      //LMS-Learning Management System
      //student information
    Scanner sc=new Scanner(System.in);
    //prompt student for id & name
    System.err.println("Enter Student ID:");
    int studentId=sc.nextInt();
    System.out.println("Enter Student Name:");
    String studentName=sc.next();
    


    //update attendance & scores
    double attendancePercentage=85.5;
    int totalScore=0;
    int noOfSubjects=0;


    //using while -repeatdly  ask for subject scores
    char continueInput='y';
    while (continueInput=='y' || continueInput=='Y') {
        System.out.println("Enter subject score:"+(noOfSubjects+1));
        int subjectScore = sc.nextInt();
        totalScore += subjectScore;
        noOfSubjects++;

        System.out.println("Do you want to add another subject score? (y/n):");
        continueInput = sc.next().charAt(0);
    
        
        
    }
    //calculate average score
    double averageScore=(double)totalScore/noOfSubjects;
    System.out.println("Average Score:"+averageScore);
    
    //determine performance based on average score
    String performance;
        if(averageScore>=85){
            performance="Excellent";
            }
        else if(averageScore>=70){
            performance=" Good";
        
        }
        else if(averageScore>=50){
            performance=" Average";
    
        }
        else{
            performance="Needs Improvement";
        }




    //check Attendance status -> less than 75% -> warning-low attendance
    //if 75% or more -> good attendance
    //try ternary operator
    //syntax: variable= (condition)?value if true:value if false;
    String attendanceStatus=(attendancePercentage<75)?"Warning: Low Attendance":"Good Attendance";



    //display student report
    System.out.println("-----Student Report-----");
    System.out.println("Student ID:"+studentId);
    System.out.println("Student Name:"+studentName);
    System.out.println("Attendance Percentage:"+attendancePercentage+"%");
    System.out.println("Total score:"+totalScore);
    System.out.println("Average Score:"+averageScore);

    System.out.println(studentName+"Performance:"+performance);
    System.out.println(studentName+"Attendance Status:"+attendanceStatus);
        












}
}