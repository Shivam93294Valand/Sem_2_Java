import java.util.Scanner;

public class Max_form_3 {
    public static void main(String[] args) {
        System.out.println("Enter 3 digits");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("1st num =" + a + " is largest");
            } else {
                System.out.println("3rd num =" + c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.println("2nd num =" + b + " is largest");
            } else {
                System.out.println("3rd num =" + c + " is largest");
            }
        }
    }
}
