package com.bake.pattern.observe;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: EventHandler 
 * @Description: �¼��Ĵ�����
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018��1��29�� ����5:10:57  
 */
public class EventHandler {
	
	private List<Event> objects;
	
	public EventHandler() {
		objects = new ArrayList<Event>();
	}
	
	//���ĳ������Ҫִ�е��¼�������Ҫ�Ĳ���
	public void addEvent(Object object, String methodName, Object...args) {
		objects.add(new Event(object, methodName,args));
	}
	
	//֪ͨ���еĶ���ִ��ָ�����¼�
	public void notifyX() throws Exception {
		for(Event e : objects) {
			e.invoke();
		}
	}
}
