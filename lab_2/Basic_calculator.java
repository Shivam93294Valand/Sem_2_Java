import java.util.Scanner;
public class Basic_calculator {
    public static void main(String[] args) {
        System.out.println("Enter 1st number:");
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        System.out.println("Enter 2nd number:");
        Double b = sc.nextDouble();
        System.out.println("Enter a operater(+,-,*,/)");
        String operation = sc.next();
        double res = 0;
        switch (operation) {
            case "+":
                res = a+b;
                break;
            case "-":
                res = a-b;
                break;
            case "*":
                res = a*b;
                break;
            case "/":
                if(b!=0){
                    res=a/b;
                }        
                else{
                    System.out.println("Error:Divison by 0 is not allowed.");
                }
                break;
            default:
            System.out.println("Error:invalid Operatortion");
                break;
            }
                System.out.println("Ans:"+res);
        }
    }