package six_class_obj_met;
import java.util.Scanner;
public class Student {
    int studentID;
    String studentName;
    int totalSessionsAttented;
    int attendanceCredits;
    int performanceCredits;
    int scoreCredits;
    int totalCredits;
    int trainerRating;
    




    //display student info
    public void displayStudentInfo() {
        System.out.println("======STUDENYT INFO======");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);


        //for taking inputs
        Scanner scanner = new Scanner((System.in));


        //calculating attendance credits
        public int sessionsCredits(){
                System.out.println("total sessions attended: ");
            totalSessionsAttented = sc.nextInt();
            if (totalSessionsAttented >= 30) {
                return attendanceCredits += 5;
            }
            else if(totalSessionsAttented>=20){
                return attendanceCredits += 3;
            }
            else{
                return 0;
            }
            }


    //calculating performance credits-->with inputs
    //score is a parameter i.e used as local
    public int performanceCredits(int score){
        if (score >= 85) {
            return performanceCredits += 5;
            }
            else if(score>=60){
                return performanceCredits += 3;
                }
                else{
                    return 0;



                }


        }
        //calculating achievements status
        public void achievementsStatus(){
            totalCredits=sessionsCredits() + scoreCredits(75);
            






}
