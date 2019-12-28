package cn.gtmap.test;

import cn.gtmap.item.Item;

public class Test02 {

	public static void main(String[] args) {
		Item bloodBottle = new Item();
		bloodBottle.setName("ÑªÆ¿");
		bloodBottle.setPrice(50);
		
		Item grassShoes = new Item();
		grassShoes.setName("²ÝÐ¬");
		grassShoes.setPrice(350);
		
		Item Sword = new Item();
		Sword.setName("³¤½£");
		Sword.setPrice(350);
		
		System.out.println(bloodBottle);
		System.out.println(grassShoes);
		System.out.println(Sword);
	}

}
