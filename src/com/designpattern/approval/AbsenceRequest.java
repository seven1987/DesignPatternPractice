/**   
* @Title: 			AbsenceRequest.java 
* @Package 			com.designpattern.approval 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-11 上午10:30:00 
* @version 			V1.0   
*/
package com.designpattern.approval;

/**
 * @author zhangwen
 *
 */
public class AbsenceRequest {
	private int day;
	private int level;
	private int employeeId;
	private String name;
	
	public AbsenceRequest(int day,String name){
		this.day = day;
		this.setName(name);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
