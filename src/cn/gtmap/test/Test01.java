package cn.gtmap.test;

import cn.gtmap.charactor.Hero;

/**
 * ���������Ӣ�۶���
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.setName("����");
		garen.setHp(616.28f);
		garen.setArmor(27.536f);
		garen.setMoveSpeed(350);
		
		Hero teemo = new Hero();
		teemo.setName("��Ī");
		teemo.setHp(46.28f);
		teemo.setArmor(24.536f);
		teemo.setMoveSpeed(360);
		
		System.out.println(garen);
		System.out.println(teemo);
	}
}
