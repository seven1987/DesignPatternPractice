/**   
* @Title: 			Cat.java 
* @Package 			com.designpattern.practice.catcry 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午2:22:26 
* @version 			V1.0   
*/
package com.designpattern.catcry;

import java.util.Observable;

/**
 * @author zhangwen
 *
 */
public class Cat extends Observable {
	private String name;
	
	public Cat(String name){
		this.name = name;
	}
	
	public void cry(){
		System.out.println("Cat ("+name+") cry!");
		this.setChanged(); 
		this.notifyObservers();
	}
}
