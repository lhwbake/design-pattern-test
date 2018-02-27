package com.bake.pattern.observe;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//创建一个称职的放哨者
		Notifier goodNotifier = new GoodNotifier();
		
		//创建玩游戏的同学，开始玩游戏
		PlayingGameListener play = new PlayingGameListener();
		
		//创建看电影的同学，开始看电影
		WatchingTVListener watch = new WatchingTVListener();
		
		//注册  玩游戏的同学告诉放哨的同学，老师来了告诉我一下
		goodNotifier.addListener(play, "stopPlayingGame", new Date());
		
		//看电视的同学告诉放哨的同学，老师来了告诉我一下   
		goodNotifier.addListener(watch, "stopWatchingTV", new Date());
		
		//一段时间后
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//老师出现，放哨的人通知所有要帮忙的同学:老师来了
		goodNotifier.notifyX();

	}

}
