package com.bake.pattern.observe;

/** 
 * @ClassName: Notifier 
 * @Description: ֪ͨ�߳�����
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018��1��29�� ����5:27:03  
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
	 * @Description: ������Ҫ��æ���ڵ�ѧ��
	 * @param object Ҫִ�з����Ķ���
	 * @param methodName Ҫִ�з���������
	 * @param args Ҫִ�з����Ĳ���
	 */
	public abstract void addListener(Object object, String methodName, Object...args);
	
	
	/** 
	 * @Title: notifyX 
	 * @Description: ��������Ҫ��æ���ڵ�ѧ������ʦ���� 
	 */
	public abstract void notifyX();
}
