import java.util.Scanner;
public class Temp_convert {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temparature in fahrenheit:");
        int f = sc.nextInt();
        int temp = (f-32)*5/9;
        System.out.print("The tampature is celsius ="+temp);
    }
}
