import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<>();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum = 0;
        for (Coin c : coins) {
            sum += c.getValue();
        }
        return sum;
        //COMPLETE THIS METHOD!
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int count = 0;
        for (Coin c : coins) {
            if (c.equals(aCoin)) count++;
        }
        return count;
        //COMPLETE THIS METHOD
    }

    public String getSmallest() {
        int smallestIndex = 0;
        for (int i = 1; i < coins.size(); i++) {
            if (coins.get(i).getValue() < coins.get(smallestIndex).getValue()) {
                smallestIndex = i;
            }
        }
        return coins.get(smallestIndex).getName();
    }
}

