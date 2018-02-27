package com.bake.pattern.observe;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//����һ����ְ�ķ�����
		Notifier goodNotifier = new GoodNotifier();
		
		//��������Ϸ��ͬѧ����ʼ����Ϸ
		PlayingGameListener play = new PlayingGameListener();
		
		//��������Ӱ��ͬѧ����ʼ����Ӱ
		WatchingTVListener watch = new WatchingTVListener();
		
		//ע��  ����Ϸ��ͬѧ���߷��ڵ�ͬѧ����ʦ���˸�����һ��
		goodNotifier.addListener(play, "stopPlayingGame", new Date());
		
		//�����ӵ�ͬѧ���߷��ڵ�ͬѧ����ʦ���˸�����һ��   
		goodNotifier.addListener(watch, "stopWatchingTV", new Date());
		
		//һ��ʱ���
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//��ʦ���֣����ڵ���֪ͨ����Ҫ��æ��ͬѧ:��ʦ����
		goodNotifier.notifyX();

	}

}
