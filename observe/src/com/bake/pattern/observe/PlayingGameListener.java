package com.bake.pattern.observe;

import java.util.Date;

public class PlayingGameListener {

	public PlayingGameListener() {
		System.out.println("����������Ϸ��ʼʱ��"+new Date());
	}
	
	public void stopPlayingGame(Date date) {
		System.out.println("��ʦ���ˣ���ص���λ�ϣ�����ʱ��"+date);
	}
	
}
