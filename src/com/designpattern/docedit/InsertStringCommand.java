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
public class InsertStringCommand extends Command {
	private String text;
	RichEdit re = new RichEdit();
	public InsertStringCommand(String text){
		this.text = text;
	}
	
	@Override
	public void exec() { 
		if(getState()==Command.State.INIT){
			re.insertString(text);
			setState(Command.State.EXECUTED);
		} 
	}

	@Override
	public void undo() { 
		if(getState()==Command.State.EXECUTED){
			System.out.println("***undo***");
			re.deleteString(text);
			System.out.println("**********");
			setState(Command.State.RECOVER);
		} 
	}

	@Override
	public void redo() { 
		if(getState()==Command.State.RECOVER){
			System.out.println("***redo***");
			re.insertString(text);
			System.out.println("**********");
			setState(Command.State.EXECUTED);
		} 
	}

}
