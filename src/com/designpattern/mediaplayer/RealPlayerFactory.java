/**   
* @Title: 			MediaPlayerFactory.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午9:30:03 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

/**
 * @author zhangwen
 *
 */
public class RealPlayerFactory implements PlayerFactory {

	@Override
	public PlayerWindow createPlayerWindow() { 
		return new RealPlayerWindow(new RealPlayerApi(),this);
	}

	@Override
	public PlayerList createPlayerList() { 
		return new RealPlayerList();
	}

}
