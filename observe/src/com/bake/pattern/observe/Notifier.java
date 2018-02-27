package com.bake.pattern.observe;

/** 
 * @ClassName: Notifier 
 * @Description: 通知者抽象类
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018年1月29日 下午5:27:03  
 */
public abstract class Notifier {
	private EventHandler eventHandler = new EventHandler();

	public EventHandler getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(EventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	
	/**
	 * 
	 * @Title: addListener 
	 * @Description: 增加需要帮忙放哨的学生
	 * @param object 要执行方法的对象
	 * @param methodName 要执行方法的名称
	 * @param args 要执行方法的参数
	 */
	public abstract void addListener(Object object, String methodName, Object...args);
	
	
	/** 
	 * @Title: notifyX 
	 * @Description: 告诉所有要帮忙放哨的学生：老师来了 
	 */
	public abstract void notifyX();
}
