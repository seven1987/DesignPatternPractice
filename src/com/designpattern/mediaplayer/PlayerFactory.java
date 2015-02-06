/**   
* @Title: 			PlayerFactory.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午8:52:51 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

/**
 * @author zhangwen
 *
 */
public interface PlayerFactory {
	PlayerWindow createPlayerWindow();
	
	PlayerList   createPlayerList();
}
