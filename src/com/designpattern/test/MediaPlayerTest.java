/**   
* @Title: 			MediaPlayerTest.java 
* @Package 			com.designpattern.test 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午9:28:23 
* @version 			V1.0   
*/
package com.designpattern.test;

import org.junit.Test;

import com.designpattern.mediaplayer.MediaPlayerFactory;
import com.designpattern.mediaplayer.PlayerFactory;
import com.designpattern.mediaplayer.PlayerList;
import com.designpattern.mediaplayer.PlayerWindow;
import com.designpattern.mediaplayer.RealPlayerFactory;

/**
 * @author zhangwen
 *
 */
public class MediaPlayerTest {
	@Test
	public void test() { 
		System.out.println("************MediaPlayerTest**************");
		PlayerFactory factory = new MediaPlayerFactory();
		PlayerWindow window = factory.createPlayerWindow();
		  
		window.start();
		window.next();
		window.pause();

		factory = new RealPlayerFactory();
		window = factory.createPlayerWindow();
		  
		window.start();
		window.pause();
		window.next();
		
		System.out.println("******************************************");
	}
}
