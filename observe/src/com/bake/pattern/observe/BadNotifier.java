package com.bake.pattern.observe;

/** 
 * @ClassName: BadNotifier 
 * @Description: 不称职的通知者
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018年1月29日 下午5:41:14  
 */
public class BadNotifier extends Notifier {

	@Override
	public void addListener(Object object, String methodName, Object... args) {
		System.out.println("有新的同学委托尽职尽责的放哨人!");
		this.getEventHandler().addEvent(object, methodName, args);
	}

	@Override
	public void notifyX() {
		System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
		try {
			this.getEventHandler().notifyX();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
