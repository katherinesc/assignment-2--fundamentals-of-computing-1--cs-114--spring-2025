import java.io.IOException;
import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) throws IOException {

    String userMessage;
    int vowelsCounter = 0;
    int spacesCounter = 0;
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
        vowelsCounter++;
      }
      if (userMessage.charAt(character)=='e'){
        e++;
        vowelsCounter++;
      }
      if (userMessage.charAt(character)=='i'){
        i++;
        vowelsCounter++;
      }
      if(userMessage.charAt(character)=='o'){
        o++;
        vowelsCounter++;
      }
      if(userMessage.charAt(character)=='u'){
        u++;
        vowelsCounter++;
      }
      if (userMessage.charAt(character) == ' '){
        spacesCounter++;
      }
    }

    scan.close();
    System.out.println("Number of vowels: " + vowelsCounter);
    System.out.println("Number of vowels that are the letter a: " + a);
    System.out.println("Number of vowels that are the letter e: " + e);
    System.out.println("Number of vowels that are the letter i: " + i);
    System.out.println("Number of vowels that are the letter o: " + o);
    System.out.println("Number of vowels that are the letter u: " + u);
    System.err.println("Number of nonvowels: " + ((userMessage.length() - vowelsCounter ) - spacesCounter));

  }
}
