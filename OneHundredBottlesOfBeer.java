import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    int userMessage;
    int numberOfVerses = 1;
    int bottlesOfBeer = 100;

    Scanner scan = new Scanner(System.in);

    System.out.println("How many number of verses do you want to print? ");
    userMessage = scan.nextInt();

    System.out.println();

    while(numberOfVerses <= userMessage){
      System.out.println(bottlesOfBeer + " bottles of beer on the wall");
      System.out.println(bottlesOfBeer + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      bottlesOfBeer--;
      System.out.println(bottlesOfBeer + " bottles of beer on the wall");
      numberOfVerses++;
      System.out.println();
    }


    scan.close();
  }
}
