import java.util.Scanner;

public class consonants_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String =");
        String S1 = sc.nextLine();
        S1 = S1.toLowerCase();
        sc.close();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < S1.length(); i++) {
            char c = S1.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels =" + vowels + " and Consonants =" + consonants);
    }
}