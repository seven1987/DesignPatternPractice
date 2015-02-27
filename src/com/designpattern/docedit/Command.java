/**   
* @Title: 			Command.java 
* @Package 			com.designpattern.docedit 
* @Description: 	TODO(用一句话描述该文件做什么) 
* @author 			张文
* @date 			2015-2-12 上午11:23:42 
* @version 			V1.0   
*/
package com.designpattern.docedit;

/**
 * @author zhangwen
 *
 */
public abstract class Command { 
	public abstract void exec();
	public abstract void undo();
	public abstract void redo();
	public enum State{
		INIT,
		EXECUTED,
		RECOVER
	}
	private State state = State.INIT; 
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
