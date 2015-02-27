/**   
* @Title: 			Approver.java 
* @Package 			com.designpattern.approval 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-11 上午10:31:57 
* @version 			V1.0   
*/
package com.designpattern.approval;

/**
 * @author zhangwen
 *
 */
public abstract class Approver {
	protected Approver successor;
	protected String   name;
	
	public Approver(String name){
		this.name = name;
	} 

	public void setSuccessor(Approver successor) {
		this.successor = successor;
	} 
	
	public abstract void processRequest(AbsenceRequest request);
}
