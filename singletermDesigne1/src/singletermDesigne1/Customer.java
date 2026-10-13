package singletermDesigne1;

import java.util.ArrayList;

class shoppingcart{
	private static shoppingcart cart;
	
	ArrayList<String> list=new ArrayList<>();
	
	private shoppingcart() {//default constructor
		
	}
	
	public void addProduct(String product) {
		list.add(product);
	}
	
	public void displaCart() {
		for(String x:list) {
			System.out.println(x);
		}
	}
	

public static shoppingcart getInstance() {
		if(cart==null) {
			cart=new shoppingcart();
		}
		return cart;
	}

}
class Customer{
	public static void main(String[] args) {
		shoppingcart shop;
		shop=shoppingcart.getInstance();
		
		shop.addProduct("Shoes");
		System.out.println(shop);
		
		shop=shoppingcart.getInstance();
		shop.addProduct("Mobile");
		
		System.out.println(shop);
		
		
	}
}