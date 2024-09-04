import java.util.Scanner;
public class Counting {
    public static void main(String[]raimal){
        Scanner sc = new Scanner(System.in);
        int Passed_student = 0;
        System.out.println("Enter number of students in the class");
        int No_Sts = sc.nextInt();

        for(int i = 1; i<=No_Sts; i++ ){
            System.out.println("Enter" + i+ "student marks");
            int marks =sc.nextInt();
            if(marks>50){
                Passed_student = Passed_student +1;
            }
        }
        System.out.println("pass Student are"+Passed_student);

    }
}
