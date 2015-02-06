/**   
* @Title: 			CatCryTest.java 
* @Package 			com.designpattern.practice.test 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午2:35:42 
* @version 			V1.0   
*/
package com.designpattern.test;

import org.junit.Test;

import com.designpattern.catcry.Cat;
import com.designpattern.catcry.Master;
import com.designpattern.catcry.Mouse;

/**
 * @author zhangwen
 *
 */
public class CatCryTest {

	@Test
	public void test() {

		System.out.println("**************com.designpattern.catcry**************");
		Cat cat = new Cat("黑猫");
		Mouse mouseA = new Mouse("A");
		Mouse mouseB = new Mouse("B");
		Master master = new Master("二愣");
		
		cat.addObserver(mouseA);
		cat.addObserver(mouseB);
		cat.addObserver(master);
		
		cat.cry();
		

		System.out.println("******************************************");
	}

}
