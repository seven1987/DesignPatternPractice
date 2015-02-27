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
public class NoPass extends Approver {

	/**
	 * @param name
	 */
	public NoPass(String name) {
		super(name); 
	}

	/**
	 * @param successor
	 */ 

	@Override
	public void processRequest(AbsenceRequest request) {
		if(request.getDay()>30){
			System.out.println(request.getName()+"请假"+request.getDay()+"天不通过!");
		}else{
			this.successor.processRequest(request);
		} 
	}

}
