import java.util.Scanner;

public class avg_arr {
    public static void main(String[] args) {
        System.out.println("Enter 4 elements in arrey =");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int sum = 0;
        for (int a : arr) {
            a = sc.nextInt();
            sum += a;
        }
        int avg = sum / 4;
        sc.close();
        System.out.println("The average =" + avg);
    }
}