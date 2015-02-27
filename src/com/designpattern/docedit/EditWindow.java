/**   
* @Title: 			CalculatorWindow.java 
* @Package 			com.designpattern.docedit 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-12 下午4:06:35 
* @version 			V1.0   
*/
package com.designpattern.docedit;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zhangwen
 *
 */
public class EditWindow {
	private Command command;
	private Stack<Command> doneCommands = new Stack<Command>(); 
	private Stack<Command> undoCommands = new Stack<Command>();
	
	public EditWindow(){
	} 

	public void setCommand(Command command){
		this.command = command;
	}
	
	public void call(){
		if(command!=null){
			command.exec();
			doneCommands.push(command);
			command = null;
			undoCommands.clear();
		}else{
			System.out.println("没有命令");
		}
	} 
	
	public void undo(){
		if(doneCommands.size()>0){
			Command item = doneCommands.pop();
			item.undo();
			undoCommands.push(item);
		}else{
			System.out.println("没有可以回退的命令");
		}
	}
	
	public void redo(){
		if(undoCommands.size()>0){
			Command item = undoCommands.pop();
			item.redo();
			doneCommands.push(item);
		}else{
			System.out.println("没有可以恢复的命令");
		}
	}
}
