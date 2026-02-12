import java.util.Scanner;
public class Practicum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int assignment, quizz, midterm, finalExam;
        double finalScore;
        
        System.out.println("=========================");
        System.out.print("Enter Assessments Score:");
        assignment = sc.nextInt();
        System.out.print("Enter Quizz Score: ");
        quizz = sc.nextInt();
        System.out.print("Enter Midterm Score: ");
        midterm = sc.nextInt();
        System.out.print("Enter Final Exam Score: ");
        finalExam = sc.nextInt();
        System.out.println("=========================");

        System.out.println("=========================");
        if (assignment > 100 || quizz > 100 || midterm > 100 || finalExam > 100) {
            System.out.println("Score Invalid");
        } else {
            finalScore = (assignment * 0.2) + (quizz * 0.2) + (midterm * 0.3) + (finalExam * 0.3);
            System.out.println("The final score is: " + finalScore);
            
            if (finalScore >= 80) {
                System.out.println("Grade: A");
            } else if (finalScore >= 73) {
                System.out.println("Grade: B+");
            } else if (finalScore >= 65) {
                System.out.println("Grade: B");
            } else if (finalScore >= 60) {
                System.out.println("Grade: C+");
            } else if (finalScore >= 50) {
                System.out.println("Grade: C");
            } else if (finalScore >= 39) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: E");
            }
            System.out.println("=========================");
            System.out.println("=========================");

            if (finalScore >= 60) {
                System.out.println("Status: Pass");
            } else {
                System.out.println("Status: Fail");
            }
        }
        System.out.println("=========================");

        sc.close();
    }
}
