/**   
* @Title: 			InsertStringComman.java 
* @Package 			com.designpattern.docedit 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-12 下午5:04:47 
* @version 			V1.0   
*/
package com.designpattern.docedit;

/**
 * @author zhangwen
 *
 */
public class InsertPictureCommand extends Command {
	private String pic;
	RichEdit re = new RichEdit();
	public InsertPictureCommand(String pic){
		this.pic = pic;
	}
	
	@Override
	public void exec() { 
		if(getState()==Command.State.INIT){
			re.insertPicture(pic);
			setState(Command.State.EXECUTED);
		} 
	}

	@Override
	public void undo() { 
		if(getState()==Command.State.EXECUTED){
			System.out.println("***undo***");
			re.deletePicture(pic);
			System.out.println("**********");
			setState(Command.State.RECOVER);
		} 
	}

	@Override
	public void redo() { 
		if(getState()==Command.State.RECOVER){
			System.out.println("***redo***");
			re.insertPicture(pic);
			System.out.println("**********");
			setState(Command.State.EXECUTED);
		} 
	}

}
