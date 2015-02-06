/**   
* @Title: 			Manager.java 
* @Package 			com.designpattern.house 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午4:39:35 
* @version 			V1.0   
*/
package com.designpattern.house;
 

/**
 * @author zhangwen
 *
 */
public class Manager implements Observer {
	private String name;
	public Manager(String name){
		this.name = name;
	}
	@Override
	public void response(House house) {
		System.out.print(name+" know: "+house.getName()+house.getId()+" 已经售出，价格为"+house.getPrice());
	} 
}
