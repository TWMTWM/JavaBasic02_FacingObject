package cn.gtmap.charactor;

/**
 * Ӣ����
 * @author Administrator
 *
 */
public class Hero {
	String name;//����
	float hp;//Ѫ��
	float armor;//����
	int moveSpeed;//�ƶ��ٶ�
	
	//�Ӷ���
	public void keng(){
		System.out.println("�Ӷ���");
	}
	
	//�����ƶ��ٶ�
	public void addSpeed(int movespeed){
		this.moveSpeed = this.moveSpeed + movespeed;
	}
	
	public void legendary(){
		System.out.println("����");
	}
	
	//��Ѫ
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
	//���û���ֵ
	public void setHp(float hp) {
		this.hp = hp;
	}
	//��ȡ����ֵ
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
