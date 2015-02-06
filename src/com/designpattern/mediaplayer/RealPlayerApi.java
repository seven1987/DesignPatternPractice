/**   
* @Title: 			MediaPlayerApi.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午9:10:32 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

/**
 * @author zhangwen
 *
 */
public class RealPlayerApi {
	
	public void start(String fileName){
		System.out.println("RealPlayer  start ("+fileName+") !");
	}
	
	public void stop(){ 
		System.out.println("RealPlayer stop!");
	}
	
	public void pause(String fileName){
		System.out.println("RealPlayer ("+fileName+") pause!"); 
	}
}
