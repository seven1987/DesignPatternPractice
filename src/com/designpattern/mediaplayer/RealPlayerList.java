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
public class RealPlayerList implements PlayerList {
	List<String> list = new ArrayList<String>();
	private int cur = 0;
	
	public RealPlayerList(){
		list.add("RealFile01");
		list.add("RealFile02");
		list.add("RealFile03");
		list.add("RealFile04");
		list.add("RealFile05");
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
