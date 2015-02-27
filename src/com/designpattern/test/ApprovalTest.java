/**   
* @Title: 			HouseTest.java 
* @Package 			com.designpattern.test 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-5 下午4:02:20 
* @version 			V1.0   
*/
package com.designpattern.test;

import org.junit.Test;

import com.designpattern.approval.AbsenceRequest;
import com.designpattern.approval.DepartmentManager;
import com.designpattern.approval.Director;
import com.designpattern.approval.GeneralManager;
import com.designpattern.approval.NoPass;

/**
 * @author zhangwen
 *
 */
public class ApprovalTest {

	@Test
	public void test() {
		System.out.println("*********ApprovalTest**************");
		Director director = new Director("乔巴");
		DepartmentManager dm = new DepartmentManager("索隆");
		GeneralManager gm = new GeneralManager("路飞");
		NoPass np = new NoPass("");
		
		director.setSuccessor(dm);
		dm.setSuccessor(gm);
		gm.setSuccessor(np);
		
		AbsenceRequest ar1 = new AbsenceRequest(2,"乌索普");
		AbsenceRequest ar2 = new AbsenceRequest(6,"娜美");
		AbsenceRequest ar3 = new AbsenceRequest(15,"布鲁克");
		AbsenceRequest ar4 = new AbsenceRequest(90,"罗宾");
		
		director.processRequest(ar1);
		director.processRequest(ar2);
		director.processRequest(ar3);
		director.processRequest(ar4);
		System.out.println("******************************************");
	}

}
