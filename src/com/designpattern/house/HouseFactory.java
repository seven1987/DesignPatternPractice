/**   
* @Title: 			HouseFactory.java 
* @Package 			com.designpattern.house 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午3:57:00 
* @version 			V1.0   
*/
package com.designpattern.house;

/**
 * @author zhangwen
 *
 */
public interface HouseFactory {
	House createHouse(String id,String address ,double price);
	
}
