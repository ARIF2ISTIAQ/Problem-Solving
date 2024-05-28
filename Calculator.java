public class Calculator {

    public int calculateTotal(CoinType coinsDrop) {
        return coinsDrop.getTotal();
    }
    
    public CoinType calculateChange(int amountMoneyToReturn) {
        CoinType change = new CoinType(new int[4]);
        int remainingAmount = amountMoneyToReturn;

	//TASK 2(i): The method getValue() is used to establish association relationship between class Calculator and enum Coin, correct the statements (code 1-8) below so getValue() can functions correctly.
    Coin tc = Coin.TENCENTS;
    Coin fc = Coin.FIFTYCENTS;
    Coin twc = Coin.TWENTYCENTS;
    Coin r1 = Coin.ONERINGGIT;
	//TASK 4(ii): Modify the following statements (code 1, 3, 5 & 7) by using proper Vector method

        change.num1Ringgit = remainingAmount / r1.getValue(); //code 1
        remainingAmount = remainingAmount % r1.getValue(); //code 2

        change.num50CentsCoins = remainingAmount / fc.getValue(); //code 3
        remainingAmount = remainingAmount % fc.getValue(); //code 4

        change.num20CentsCoins = remainingAmount / twc.getValue(); //code 5
        remainingAmount = remainingAmount % twc.getValue(); //code 6

        change.num10CentsCoins = remainingAmount / tc.getValue(); //code 7
        remainingAmount = remainingAmount % tc.getValue(); //code 8

        return change;
    }
}