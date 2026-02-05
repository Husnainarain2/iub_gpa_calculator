
import java.util.Scanner;

class SGPA{
    double qualityPoint;
    double creditHours;
    double result;
    SGPA(double qualityPoint,double creditHours){
        this.creditHours=creditHours;
        this.qualityPoint=qualityPoint;
    }
    double calculateSGPA(){
         this.result=qualityPoint/creditHours;
         return Math.round(result * 100.0) / 100.0;
    }
}
class CGPA {
    double totalQualityPoints=0;
    double totalCreditHours=0;

    void addSemester(SGPA semster){
        totalQualityPoints+=semster.qualityPoint;
        totalCreditHours+=semster.creditHours;
    }
    double  calculateCGPA(){
        double resultCGPA= totalQualityPoints/totalCreditHours;
        return Math.round(resultCGPA * 100.0) / 100.0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of semesters: ");
        int n = input.nextInt();

        CGPA studentCGPA = new CGPA();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSemester " + i);

            System.out.print("Enter quality points: ");
            double qp = input.nextDouble();

            System.out.print("Enter credit hours: ");
            double ch = input.nextDouble();

            SGPA semester = new SGPA(qp, ch);
            System.out.println("SGPA: " + semester.calculateSGPA());

            studentCGPA.addSemester(semester);
        }

        System.out.println("\nFinal CGPA: " + studentCGPA.calculateCGPA());
    }

    }

