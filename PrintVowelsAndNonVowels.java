import java.io.IOException;
import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) throws IOException {

    String userMessage;
    int vowels = 0;
    int nonvowels = 0;
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
      if(userMessage.charAt(character) == 'b'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'c'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'd'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'f'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'g'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'h'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'j'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'k'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'l'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'm'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'n'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'p'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'q'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'r'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 's'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 't'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'v'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'w'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'x'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'y'){
        nonvowels++;
      }
      if(userMessage.charAt(character) == 'z'){
        nonvowels++;
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
