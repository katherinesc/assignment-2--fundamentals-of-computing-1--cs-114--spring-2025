public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {

    String days = "";

    for (int verses = 1; verses <= 12; verses++ ){
      //for (int days = 1; days <= 12; days++){
        switch(verses){
          case 12:
          days = "12th";

          case 11:
          days = "11th";

          case 10:
          days = "10th";

          case 9:
          days = "9th";

          case 8:
          days = "8th";

          case 7:
          days = "7th";

          case 6:
          days = "6th";

          case 5:
          days = "5th";

          case 4:
          days = "4th";

          case 3:
          days = "3rd";

          case 2:
          days = "2nd";

          case 1:
          days = "1st";
        }
        System.out.println("On the " + days + " day of Chritsmas my true love gave to me");



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
