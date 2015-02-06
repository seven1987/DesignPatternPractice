/**   
* @Title: 			House.java 
* @Package 			com.designpattern.house 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午3:49:00 
* @version 			V1.0   
*/
package com.designpattern.house;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhangwen
 *
 */
public abstract class House { 
	private String id;
	private String name;
	private String address;
	private double price; 
	
	public House(String id,String name,String address,double price){
		this.id=id;
		this.name = name;
		this.address = address;
		this.price = price;
	}
	 
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
 
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
 
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
 
	public String getInfo() {
		 
		return "Name:"+name+" , Address:"+address+" ,Price:"+price;
	}
 
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	private List<Observer> list = new ArrayList<Observer>(); 
	private boolean sold = false;
	
	public void setSold(boolean flag){
		if(flag==true&&sold!=true){
			notifyObserver();
		} 
		sold = flag;
	}
	
	public void addObserver(Observer observer){
		list.add(observer);
	}
	
	public void notifyObserver(){
		Iterator<Observer> iter = list.iterator();
		while(iter.hasNext()){
			iter.next().response(this);
		}
	}
}
