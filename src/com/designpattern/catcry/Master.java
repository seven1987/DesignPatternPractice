/**   
* @Title: 			Master.java 
* @Package 			com.designpattern.practice.catcry 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午2:32:25 
* @version 			V1.0   
*/
package com.designpattern.catcry;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangwen
 *
 */
public class Master implements Observer { 
	private String name ;
	
	public Master(String name){
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		wakeup();
	}

	private void wakeup(){
		System.out.println("Master "+ name + " wake up!");
	}
}
