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
public class MediaPlayerApi {
	
	public void start(String fileName){
		System.out.println("MediaPlayer start ("+fileName+") !");
	}
	
	public void stop(){ 
		System.out.println("MediaPlayer stop!");
	}
	
	public void pause(String fileName){
		System.out.println("MediaPlayer ("+fileName+") pause!"); 
	}
}
