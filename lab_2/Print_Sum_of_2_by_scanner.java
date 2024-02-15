import java.util.Scanner;
public class Print_Sum_of_2_by_scanner {
    public static void main(String[] args) {
        System.out.println("enter 1st number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int y = sc.nextInt();
        System.out.println("Sum:"+(n+y));
    }
}