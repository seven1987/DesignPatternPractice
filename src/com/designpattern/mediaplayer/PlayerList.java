/**   
* @Title: 			PlayerWindow.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午8:49:44 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

/**
 * @author zhangwen
 *
 */
public interface PlayerList {

	String selectedFileName();
	
	int count(); 
	
	String nextFileName();
	
	String firstFileName();
}
