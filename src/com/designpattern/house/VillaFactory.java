/**   
* @Title: 			VillaFactory.java 
* @Package 			com.designpattern.house 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午3:58:22 
* @version 			V1.0   
*/
package com.designpattern.house;

/**
 * @author zhangwen
 *
 */
public class VillaFactory implements HouseFactory {
	private static double DEFAULT_PRICE = 10000000.0;
	@Override
	public House createHouse(String id,String address ,double price) {
		return new Villa( id,address ,price);
	}

}
