package befaster.solutions.CHK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import befaster.runner.SolutionNotImplementedException;


/*
| Item | Price | Special offers |
+------+-------+----------------+
| A    | 50    | 3A for 130     |
| B    | 30    | 2B for 45      |
| C    | 20    |                |
| D    | 15    |                |
+------+-------+----------------+

*/

class SKUItem {
	public String itemName;
	public int itemPrice;
	public int itemOfferPrice = 0;
	public int quantityForOfferPrice =0;
};
	

public class CheckoutSolution {
	private List<SKUItem> skuList;  
	
	public CheckoutSolution() {
		skuList = new ArrayList<SKUItem>();
		
		SKUItem itemA = new SKUItem();
		itemA.itemName="A";
		itemA.itemPrice=50;
		itemA.itemOfferPrice=130;
		itemA.quantityForOfferPrice=3;
		
		skuList.add(itemA);
		
		SKUItem itemB = new SKUItem();
		itemB.itemName="B";
		itemB.itemPrice=30;
		itemB.itemOfferPrice=45;
		itemB.quantityForOfferPrice=2;
		
		skuList.add(itemB);
		
		SKUItem itemC = new SKUItem();
		itemC.itemName="C";
		itemC.itemPrice=20;
	
		skuList.add(itemC);
			
		SKUItem itemD = new SKUItem();
		itemD.itemName="D";
		itemD.itemPrice=15;
	
		skuList.add(itemD);
		
	}
    
	public Integer checkout(String skus) {
		// Example string "4A,3B,C,D"
		int returnValue =0;
		
		List<String> items = Arrays.asList( skus.split(","));
		
		for(String item :items )
		{
			returnValue += costItem(item);
		}
		
		return returnValue;
		    
    }

	private int costItem(String item) {
		
		
		
		return 0;
	}
}
