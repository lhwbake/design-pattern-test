package com.bake.pattern.observe;

/** 
 * @ClassName: BadNotifier 
 * @Description: ����ְ��֪ͨ��
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018��1��29�� ����5:41:14  
 */
public class BadNotifier extends Notifier {

	@Override
	public void addListener(Object object, String methodName, Object... args) {
		System.out.println("���µ�ͬѧί�о�ְ����ķ�����!");
		this.getEventHandler().addEvent(object, methodName, args);
	}

	@Override
	public void notifyX() {
		System.out.println("��ְ����ķ����˸���������Ҫ��æ��ͬѧ����ʦ����");
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
