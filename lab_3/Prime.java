import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        sc.close();
        boolean flag = true;
        for (int i = 2; i <= (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not Prime");
        }
    }
}