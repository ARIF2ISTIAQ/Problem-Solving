public enum Coin {
    TENCENTS(10), TWENTYCENTS(20),  FIFTYCENTS(50), ONERINGGIT(100);

    private int value;

    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }  

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];
        for(int index=0;index<numberCoinsInText.length;index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
        return result;
    }     
}