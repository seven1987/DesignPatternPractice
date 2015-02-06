/**   
* @Title: 			HouseTest.java 
* @Package 			com.designpattern.test 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午4:02:20 
* @version 			V1.0   
*/
package com.designpattern.test;

import org.junit.Test;

import com.designpattern.house.DepartmentFactory;
import com.designpattern.house.House;
import com.designpattern.house.HouseFactory;
import com.designpattern.house.Manager;

/**
 * @author zhangwen
 *
 */
public class HouseTest {

	@Test
	public void test() {
		System.out.println("*********com.designpattern.house**************");
		HouseFactory factory = new DepartmentFactory();
		House houseA = factory.createHouse("a01","长安街001号" ,1000000.0);
		House houseB = factory.createHouse("a02","长安街002号" ,1200000.0);
		House houseC = factory.createHouse("a03","长安街003号" ,1500000.0);
		House houseD = factory.createHouse("a04","长安街004号" ,900000.0);
		
		System.out.println(houseA.getInfo());
		System.out.println(houseB.getInfo());
		System.out.println(houseC.getInfo());
		System.out.println(houseD.getInfo());
		
		Manager manager = new Manager("王经理");
		houseA.addObserver(manager);
		houseB.addObserver(manager);
		houseC.addObserver(manager);
		houseD.addObserver(manager);
		
		
		houseA.setSold(true);
		System.out.println("******************************************");
	}

}
