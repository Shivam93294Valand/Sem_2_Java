import java.util.Scanner;
public class Stud_marks{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max marks =");
        double max_marks = sc.nextDouble();
        System.out.println("Enter your 5 subject Marks");
        double total= 0;
        for(int i=1;i<=5;i++){
            Double marks = sc.nextDouble();
            total+=marks;
        }
        double avg = (total/5)*(100/max_marks);
        if(avg>=60){
            System.out.println("1st division");
        } else if (avg>=50){
            System.out.println("2nd division");
        } else if (avg>=40){
            System.out.println("3rd division");
        } else {
            System.out.println("fail");
        }
    }
}