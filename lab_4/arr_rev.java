import java.util.Scanner;

public class arr_rev {
    public static void main(String[] args) {
        System.out.print("Enter size of arry =");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Arry [" + i + "] =");
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed arrey :");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println("Arry [" + i + "] =" + arr[i]);
        }
        sc.close();
    }
}
