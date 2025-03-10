public class CountFlips {
  public static void main(String[] args) {
    int MAX = 100;
    int headsCounter = 0;
    int tailsCounter = 0;
    int totalCoinFlips = 0;

    Coin myCoin = new Coin();

    myCoin.flip();

    while (totalCoinFlips < MAX){
      if (myCoin.isHeads()) {
        headsCounter ++;
        totalCoinFlips ++;
        myCoin.flip();
      } else {
        tailsCounter ++;
        totalCoinFlips ++;
        myCoin.flip();
    }
    }
    System.out.println("Heads: " + headsCounter);
    System.out.println("Tails: " + tailsCounter);
  }
  }
