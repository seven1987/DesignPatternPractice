/**   
* @Title: 			Director.java 
* @Package 			com.designpattern.approval 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-11 上午10:34:21 
* @version 			V1.0   
*/
package com.designpattern.approval;

/**
 * @author zhangwen
 *
 */
public class GeneralManager extends Approver {

	/**
	 * @param name
	 */
	public GeneralManager(String name) {
		super(name); 
	}

	/**
	 * @param successor
	 */ 

	@Override
	public void processRequest(AbsenceRequest request) {
		if(request.getDay()<30){
			System.out.println(request.getName()+"请假"+request.getDay()+"天,"+"通过总经理("+this.name+")审批!");
		}else{
			this.successor.processRequest(request);
		} 
	}

}
