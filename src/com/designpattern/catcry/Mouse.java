/**   
* @Title: 			Mouse.java 
* @Package 			com.designpattern.practice.catcry 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午2:24:51 
* @version 			V1.0   
*/
package com.designpattern.catcry;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangwen
 *
 */
public class Mouse implements Observer {
	private String name;
	
	public Mouse(String name){
		this.name = name;
	}
	
	@Override
	public void update(Observable cat, Object arg) { 
		run(); 
	}

	private void run(){
		System.out.println("Mouse "+ name +" run away");
	}
}
