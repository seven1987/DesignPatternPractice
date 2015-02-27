/**   
* @Title: 			TextEdit.java 
* @Package 			com.designpattern.docedit 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-12 下午4:58:52 
* @version 			V1.0   
*/
package com.designpattern.docedit;

/**
 * @author zhangwen
 *
 */
public class RichEdit {
	public void insertString(String text){
		System.out.println("新增文本:"+text);
	}
	
	public void deleteString(String text){
		System.out.println("删除文本:"+text);
	}
	
	public void insertPicture(String picName){
		System.out.println("插入图片:"+picName);
	}
	
	public void deletePicture(String picName){
		System.out.println("删除图片:"+picName);
	}
}
