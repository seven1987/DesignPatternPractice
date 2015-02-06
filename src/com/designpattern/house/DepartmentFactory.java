/**   
* @Title: 			DepartmentFactory.java 
* @Package 			com.designpattern.house 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午4:01:14 
* @version 			V1.0   
*/
package com.designpattern.house;

/**
 * @author zhangwen
 *
 */
public class DepartmentFactory implements HouseFactory {

	private static double DEFAULT_PRICE = 10000000.0;
	
	@Override
	public House createHouse(String id,String address ,double price){
		// TODO Auto-generated method stub
		return new Department( id,address ,price);
	}

}
