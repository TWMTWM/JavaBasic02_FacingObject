package cn.gtmap.charactor;

/**
 * 英雄类
 * @author Administrator
 *
 */
public class Hero {
	String name;//姓名
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	
	//坑队友
	public void keng(){
		System.out.println("坑队友");
	}
	
	//增加移动速度
	public void addSpeed(int movespeed){
		this.moveSpeed = this.moveSpeed + movespeed;
	}
	
	public void legendary(){
		System.out.println("超神");
	}
	
	//回血
	public void recovery(float hp){
		this.hp = this.hp + hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHp() {
		return hp;
	}
	//设置护甲值
	public void setHp(float hp) {
		this.hp = hp;
	}
	//获取护甲值
	public float getArmor() {
		return armor;
	}
	public void setArmor(float armor) {
		this.armor = armor;
	}
	public int getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + ", armor=" + armor + ", moveSpeed=" + moveSpeed + "]";
	}
	
}
