/**   
* @Title: 			MediaPlayerWindow.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午9:08:48 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

/**
 * @author zhangwen
 *
 */
public class RealPlayerWindow implements PlayerWindow {
	RealPlayerApi api;
	private PlayerList list;

	public RealPlayerWindow(RealPlayerApi api,PlayerFactory factory){
		this.api = api;
		this.list = factory.createPlayerList();
	}
	@Override
	public void start() {
		if(api!=null&&list!=null)
			api.start(list.selectedFileName());
	}

	@Override
	public void pause() { 
		if(api!=null&&list!=null)
			api.pause(list.selectedFileName());
	}

	@Override
	public void stop() { 
		if(api!=null&&list!=null)
			api.stop();
	}

	@Override
	public void next() { 
		if(api!=null&&list!=null)
			api.start(list.nextFileName());
	}
 

}
