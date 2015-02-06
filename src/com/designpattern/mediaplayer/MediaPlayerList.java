/**   
* @Title: 			MediaPlayList.java 
* @Package 			com.designpattern.mediaplayer 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-6 上午9:06:45 
* @version 			V1.0   
*/
package com.designpattern.mediaplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangwen
 *
 */
public class MediaPlayerList implements PlayerList {
	List<String> list = new ArrayList<String>();
	private int cur = 0;
	
	public MediaPlayerList(){
		list.add("MediaFile01");
		list.add("MediaFile02");
		list.add("MediaFile03");
		list.add("MediaFile04");
		list.add("MediaFile05");
	}
	@Override
	public String selectedFileName() {
		// TODO Auto-generated method stub
		return list.get(cur);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public String nextFileName() {
		cur++;
		cur%=list.size();
		return list.get(cur);
	}

	@Override
	public String firstFileName() {
		cur=0;
		return list.get(cur);
	}
}
