public enum SnackList {
	//TASK 1(i): enum constant values and fields come here. Complete the enum declaration with data listed in Table 1.
	CHIPS(1, 100),
	MIMIS(2, 50),
	TAMTAM(3, 50),
	MAMI(4, 60),
	SOYUMI(5, 70),
	EMPTY(0,0);
	private int selectionNumber;
	private int snackPrice;	

   private SnackList(int selectionNumber, int pri) {
     	this.selectionNumber = selectionNumber; 
	snackPrice = pri;	
   }

   public int getSelectionNumber() 
	{
		return selectionNumber;
	}
   
   public int getSnackPrice()
	{
		return snackPrice;
	}
}
