package cn.gtmap.test;

import cn.gtmap.charactor.Hero;

/**
 * ���󷽷�
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Hero teemo = new Hero();
		teemo.setName("��Ī");
		teemo.setArmor(24.45f);
		teemo.setHp(523.34f);
		teemo.setMoveSpeed(365);
		System.out.println(teemo);
		
		
		teemo.keng();
		teemo.legendary();
		teemo.addSpeed(5);
		teemo.recovery(7);
		System.out.println("�����Լ���Ѫ����Ī��״̬��");
		System.out.println(teemo);
	}
}
