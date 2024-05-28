import java.util.ArrayList;
import java.util.Arrays;

public class CoinType {
    //TASK 3(i): Change all the int variables num10CentsCoins until num1Ringgit declaration into a single Vector object declaration

    ArrayList<Integer> Coins;
    
    public CoinType(int... coinsDrop) {
	//TASK 3(ii): Modify the statements below to add elements stored in coinsDrop[] using proper Vector method
        Coins = new ArrayList<>(Arrays.asList(coinsDrop[0], coinsDrop[1], coinsDrop[2], coinsDrop[3]));

    }   

    public int getTotal(){
        int total = 0;

	//TASK 2(ii): The method getValue() is used to establish association relationship between class CoinType and enum Coin, correct the statements (code 1-4) below so getValue() can functions correctly.
        Coin tc = Coin.TENCENTS;
        Coin fc = Coin.FIFTYCENTS;
        Coin twc = Coin.TWENTYCENTS;
        Coin r1 = Coin.ONERINGGIT;

        //TASK 4(i): Modify the following statements below using Vector method (code 1-4)

        total = total+this.Coins.get(0) * tc.getValue(); //code 1
        total = total+this.Coins.get(1)* twc.getValue(); //code 2
        total = total+this.Coins.get(2)* fc.getValue(); //code 3
        total = total+this.Coins.get(3)* r1.getValue(); //code 4
        return total;
    } 
}