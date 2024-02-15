import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
        System.out.print("Enter radious of circle:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        Double area = (3.14*r*r);
        System.out.print("Area of circle is ="+area);
    }
}
