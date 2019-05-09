package befaster.solutions.CHK;

import java.util.ArrayList;
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
	public String itemOffer;
};
	

public class CheckoutSolution {
	private List<SKUItem> skuList;  
	
	public CheckoutSolution() {
		skuList = new ArrayList<SKUItem>();
		
		SKUItem itemA = new SKUItem();
		itemA.itemName="A";
		itemA.itemPrice=50;
		itemA.itemOffer="3A";
		skuList.add(itemA);
		
		SKUItem itemB = new SKUItem();
		itemB.itemName="B";
		itemB.itemPrice=30;
		itemB.itemOffer="2B";
		skuList.add(itemB);
		
		SKUItem itemC = new SKUItem();
		itemC.itemName="C";
		itemC.itemPrice=20;
		itemC.itemOffer="";
		skuList.add(itemC);
		
		
		SKUItem itemD = new SKUItem();
		itemD.itemName="D";
		itemD.itemPrice=15;
		itemD.itemOffer="";
		skuList.add(itemD);
		
	}
    
	public Integer checkout(String skus) {
		int result = 290;
		// Example string "4A,3B,C,D"
		String[] basket = skus.split(",");
		
		for(String item : basket)
		{
			result = costItem(item);
		}
		
		
    	return result;    
    }

	private int costItem(String item) {
		// TODO Auto-generated method stub
		char[] itemFields =item.toCharArray();
		
		//Quantity 
		int quantity = itemFields[0];
		char itemName = itemFields[1];

		for(SKUItem skuItem : skuList)	{
			if(itemName == skuItem.itemName)
			
		}
		
		
		return 0;
	}
}

