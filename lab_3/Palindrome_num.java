import java.util.Scanner;
public class Palindrome_num {
    public static void main(String [] args){
        System.out.print("Enter a number =");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c =num;
        int rev = 0;
        for(int i=1;num>0;i++){
            rev = num%10 + rev*10;
            num = num/10;
        }
        if(rev==c){
            System.out.println("number is pelindrome");
        }
        else{
            System.out.println("number is not pelindrome");
        }
    }
}