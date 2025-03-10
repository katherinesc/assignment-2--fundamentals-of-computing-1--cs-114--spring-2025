import java.io.IOException;
import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) throws IOException {

    String userMessage;
    int vowels = 0;
    int spaces = 0;
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string: ");
    userMessage = scan.nextLine();

    for (int character = 0; character < userMessage.length(); character++ ){
      if (userMessage.charAt(character)=='a'){
        a++;
        vowels++;
      }
      if (userMessage.charAt(character)=='e'){
        e++;
        vowels++;
      }
      if (userMessage.charAt(character)=='i'){
        i++;
        vowels++;
      }
      if(userMessage.charAt(character)=='o'){
        o++;
        vowels++;
      }
      if(userMessage.charAt(character)=='u'){
        u++;
        vowels++;
      }
      if (userMessage.charAt(character) == ' '){
        spaces++;
      }
    }


    scan.close();
    System.out.println("Number of vowels: " + vowels);
    System.out.println("Number of vowels that are the letter a: " + a);
    System.out.println("Number of vowels that are the letter e: " + e);
    System.out.println("Number of vowels that are the letter i: " + i);
    System.out.println("Number of vowels that are the letter o: " + o);
    System.out.println("Number of vowels that are the letter u: " + u);
    System.err.println("Number of nonvowels: " + ((userMessage.length() - vowels ) - spaces));

  }
}
