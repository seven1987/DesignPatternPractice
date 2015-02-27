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

import com.designpattern.docedit.EditWindow;
import com.designpattern.docedit.InsertPictureCommand;
import com.designpattern.docedit.InsertStringCommand;

/**
 * @author zhangwen
 *
 */
public class DocEditTest {

	@Test
	public void test() {
		System.out.println("*********DocEditTest**************");
		EditWindow ew = new EditWindow();
		InsertStringCommand isc1 = new InsertStringCommand("文本1");
		ew.setCommand(isc1);
		ew.call();
		
		InsertStringCommand isc2 = new InsertStringCommand("文本2");
		ew.setCommand(isc2);
		ew.call();
		
		InsertStringCommand isc3 = new InsertStringCommand("文本3");
		ew.setCommand(isc3);
		ew.call();
		ew.undo();
		
		InsertPictureCommand ipc1 = new InsertPictureCommand("图片1");
		ew.setCommand(ipc1);
		ew.call(); 
		
		InsertPictureCommand ipc2 = new InsertPictureCommand("图片2");
		ew.setCommand(ipc2);
		ew.call(); 	
		ew.undo();
		ew.redo(); 
		
		InsertPictureCommand ipc3 = new InsertPictureCommand("图片3");
		ew.setCommand(ipc3);
		ew.call(); 
		
		System.out.println("******************************************");
	}

}
