public class CountFlips {
  public static void main(String[] args) {
    int MAX = 100;
    int heads = 0;
    int tails = 0;
    int totalCoinflips = 0;

    Coin myCoin = new Coin();

    myCoin.flip();

    while (totalCoinflips < MAX){
      if (myCoin.isHeads()) {
        heads ++;
        totalCoinflips ++;
        myCoin.flip();
      } else {
        tails ++;
        totalCoinflips ++;
        myCoin.flip();
    }
    }
    System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
  }
  }
