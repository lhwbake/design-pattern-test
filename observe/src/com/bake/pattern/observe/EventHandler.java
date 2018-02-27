package com.bake.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: EventHandler 
 * @Description: 事件的处理者
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018年1月29日 下午5:10:57  
 */
public class EventHandler {
	
	private List<Event> objects;
	
	public EventHandler() {
		objects = new ArrayList<Event>();
	}
	
	//添加某个对象要执行的事件，及需要的参数
	public void addEvent(Object object, String methodName, Object...args) {
		objects.add(new Event(object, methodName,args));
	}
	
	//通知所有的对象执行指定的事件
	public void notifyX() throws Exception {
		for(Event e : objects) {
			e.invoke();
		}
	}
}
