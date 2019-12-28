package cn.gtmap.test;

import cn.gtmap.charactor.Hero;

/**
 * 对象方法
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Hero teemo = new Hero();
		teemo.setName("提莫");
		teemo.setArmor(24.45f);
		teemo.setHp(523.34f);
		teemo.setMoveSpeed(365);
		System.out.println(teemo);
		
		
		teemo.keng();
		teemo.legendary();
		teemo.addSpeed(5);
		teemo.recovery(7);
		System.out.println("加速以及回血后提莫的状态：");
		System.out.println(teemo);
	}
}
