package six_class_obj_met;
public class LMSOperators {
    public static void main(String[] args) {
        //variables
        int studentID=101;
        String studentName="John";
        byte studentAge=20;
        byte quizScore=70;
        byte assignmentScore=80;
        byte examScore=90;
        double attendance=75;
        //calculations  -->operators
        double totalScore=quizScore+assignmentScore+examScore;
        double averageScore=totalScore/3;
        //determine student  status-->passed?
        boolean isSudentPassed=averageScore>=75;
        //update attendance-->increment
        attendance++;
        //Evaluate student qualified-->logical
        //requires high attendance(80 or above) & passing grade
        boolean isStudentQualified=attendance>=80 && isSudentPassed;
        //display results
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Age: "+studentAge);
        System.out.println("Quiz Score: "+quizScore);
        System.out.println("Assignment Score: "+assignmentScore);
        System.out.println("Exam Score: "+examScore);
        System.out.println("updated Attendance: "+attendance);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+averageScore);
    
        System.out.println("Student Passed: "+isSudentPassed);
        System.out.println("Student Qualified: "+isStudentQualified);

    }


}
