package cn.gtmap.item;

/**
 * 物品类
 * @author Administrator
 *
 */
public class Item {
	String name;//名称
	int price;//价格
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
}
