public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    String days = "0";

    for (int verses = 1; verses <= 12; verses++ ){

      switch(verses){
        case 12:
        days = "12th";
        break;

        case 11:
        days = "11th";
        break;

        case 10:
        days = "10th";
        break;

        case 9:
        days = "9th";
        break;

        case 8:
        days = "8th";
        break;

        case 7:
        days = "7th";
        break;

        case 6:
        days = "6th";
        break;

        case 5:
        days = "5th";
        break;

        case 4:
        days = "4th";
        break;

        case 3:
        days = "3rd";
        break;

        case 2:
        days = "2nd";
        break;

        case 1:
        days = "1st";

      }
      System.out.println();
      System.out.println("On the " + days + " day of Christmas my true love gave to me");

      switch (verses){
        case 12:
        System.out.println("Twelve drummers drumming,");
        case 11:
        System.out.println("Eleven pipers piping,");
        case 10:
        System.out.println("Ten lords a-leaping,");
        case 9:
        System.out.println("Nine ladies dancing,");
        case 8:
        System.out.println("Eight maids a-milking,");
        case 7:
        System.out.println("Seven swans a-swimming,");
        case 6:
        System.out.println("Six geese a-laying,");
        case 5:
        System.out.println("Five golden rings,");
        case 4:
        System.out.println("Four calling birds,");
        case 3:
        System.out.println("Three French hens,");
        case 2:
        System.out.println("Two turtle doves, and");
        case 1:
        System.out.println("A partridge in a pear tree.");
      }

    }


    }
  }
