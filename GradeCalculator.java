public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "Mathematicalliouses";
    int avgMinPerWeek = 523;
    int hw1 = 75;
    int hw2 = 99;
    int hw3 = 98;
    int hw4 = 97;

    double quiz1 = 99.90;
    double quiz2 = 99.87;

    double finalExam = 31.00;

    System.out.println("Course name: " + course);
    System.out.println("Average time spent in a week for " + course + " in minutes: " + avgMinPerWeek);
    System.out.println("Homework Grades: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("Quiz grades: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("Final exam grade: "); 
    System.out.println(finalExam);

    int avgHwGrade = (int)(hw1 + hw2 + hw3 + hw4)/4;
   
    int avgQuizGrade = (int)(quiz1 + quiz2)/2;


    int FinalGrade = (int)(avgHwGrade * 0.35) + (int)(avgQuizGrade * 0.15) + (int)(finalExam * 0.50);
    System.out.println("overall grade: " + FinalGrade);


 


  }
}
