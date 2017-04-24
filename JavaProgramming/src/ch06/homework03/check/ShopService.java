package ch06.homework03.check;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	private ShopService(){
		
	}
	static ShopService getInstance(){
		return shopservice;
	}
}
