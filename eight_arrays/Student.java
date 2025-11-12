package eight_arrays;

import java.util.Scanner;

public class Student {
    // instance variables
    int studentID;
    String studentName;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
    int trainerRating;


    //Define 15 subj scores
    //int subOneScore;
    //int subTwoScore;
    //int SubFiveScore;
    //Scores Array
    // int[] scores = new int[5];//static array for subjects
    
    //scores array Dynamic array

    int[] scores ;//will init by student


    //Fefault constructor
    public Student(int studentID, String studentName,long studentMobileNumber,int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        //this.studentMobileNumber = studentMobileNumber;

        //this.studentAge = studentAge;
    }

    //constructor to init studentID and studentName
    public Student(int studentID, String studentName) {
       // this(studentID:103,studentName:"Suresh",studentMobileNumber:9876543210L,studentAge:21);
    
    }


    // display student info
    public void studentInfo() {
        System.out.println("====== STUDENT INFO======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    //long info
    public void completeStudentInfo() {
        System.out.println("====== COMPLETE STUDENT INFO======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
       // System.out.println("Student Mobile Number: "+studentMobileNumber);
       // System.out.println("Student Age: "+studentAge);
    }
    // For Taking inputs
    Scanner sc = new Scanner((System.in));

    //sessioncredits- calc attendance credits
    public int sessionsCredits(){
        System.out.println("Enter Total Sessions Attended: ");
        totalSessionsAttended = sc.nextInt();
        if (totalSessionsAttended>=30) {
            return attendanceCredits += 5;
        } else if (totalSessionsAttended>=20) {
            return attendanceCredits += 3;
        } else {
            return 0;
        }
    }


    //calc avg score
    public double calcAvgScore() {
        System.out.println("Enter number of subjects: ");
        int numOfSubjects = sc.nextInt();
        scores = new int[numOfSubjects];//dynamic array init
        int sum=0;
        //read scoresone by one
        for (int i=0;i<numOfSubjects;i++) {
            System.out.println("Enter score for subject "+(i+1)+": ");
            scores[i] = sc.nextInt();
            sum += scores[i];//sum = sum + scores[i];

    }//
    //calc avg
        double avg = sum/ (double) numOfSubjects;
        return avg;
    }

    // calculating attendance credits -> no input
    public int scoreCredits() {
        System.out.println("Enter Total Sessions Attended: ");
        totalSessionsAttended = sc.nextInt();
        if (totalSessionsAttended>=30) {
            return attendanceCredits += 5;
        } else if (totalSessionsAttended>=20) {
            return attendanceCredits += 3;
        } else {
            return 0;
        }
    }
    


    // calculating performance credits -> with input
    // score is a parameter i.e used as local
    public int scoreCredits(int score) {
        if (score >=85) {
            return performanceCredits += 5;
        } else if(score >=60) {
            return performanceCredits += 3;
        } else {
            return 0;
        }
    }

    // calculating achievement status
    public void achievementStatus() {
        totalCredits = sessionsCredits() + scoreCredits(95);
        if (totalCredits>=10) {
            System.out.println("==GOLD==");
        } else if (totalCredits>=8) {
            System.out.println("==SILVER==");
        } else {
            System.out.println("==NEED IMPROVEMENT==");
        }
    }

    // assign trainer rating
    public int trainerRatings() {
        System.out.println("Enter Trainer Rating: (1-5)");
        trainerRating = sc.nextInt();

        if (trainerRating==5) {
            return 5000;
        } else {
            return 0;
        }
    }

}



    