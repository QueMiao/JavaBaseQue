package com.self.GuessDemo.javabase;

import java.util.Scanner;

/**
 * 游戏房间
 * @author jyk
 *
 */
public class GameRoom {
	//属性:记分牌、道具、参与游戏的玩家、房间号、房间名称、房间密码等等
	//private String weapon;
	private HumanPlayer player1 = null;
	private ComPlayer player2 =null;
	/**房间ID*/
	private int roomId;
	/**房间名称*/
	private String roomName;
	/**房间密码*/
	private String roomPass;
	
	public GameRoom(String roomId , String roomPass){
		if (!("admin".equals(roomId) && "123".equals(roomPass))) {
			System.out.println("房间密码错误，游戏已退出");
			return;
		}
		this.setRoomName(roomId);
		initGame();
		startGame();
		endGame();
		
	}
	
	//方法:开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类中）
	
	public void initGame(){
		//1.实例化玩家对象
		//选择角色
		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		//2.初始化游戏的其他属性
		//如：游戏中的花花草草 
		System.out.print("正在加载");
		for (int i = 0; i < 15; i++) {
			System.out.print("·");
			try {
				Thread.sleep(200);
			} catch (Exception e) {
//				e.printStackTrace();
			}
		}
		System.out.println("\n游戏加载成功！");
	}
	public void startGame(){
		showMenu();
		choiceRole();
		gaming();
		//打印结果
	}
	/**
	 * 游戏的大循环
	 */
	private void gaming() {
		while (true) {	
		//双方出拳
		System.out.println(player1.getName()+"请出拳：");
		player1.setFist(new Scanner(System.in).nextInt());
		player2.getFist();
		int fist1 = player1.getFist();
		int fist2 = player2.getFist();
		//判断输赢
		int result = judge(fist1, fist2);		//调用方法判断结果
		//如果返回 -1 玩家1胜利 ，返回 0 打平   返回1 玩家2胜利
		if (result == -1) {
			System.out.println("【蜻蜓队长】:"+player1.getName()+"胜利！");
			player1.sendMessage(HumanPlayer.MessageTypeWin);
			player2.sendMessage(ComPlayer.MessageTypeLose);
		} else if(result == 0){
			System.out.println("【蜻蜓队长】:本回合平局！");
			player1.sendMessage(HumanPlayer.MessageTypeFist);
			player2.sendMessage(ComPlayer.MessageTypeFist);
		}else {
			System.out.println("【蜻蜓队长】:"+player2.getName()+"胜利！");
			player2.sendMessage(ComPlayer.MessageTypeWin);
			player1.sendMessage(HumanPlayer.MessageTypeLose);
		}
		System.out.println("是否要继续：");
		String answer = new Scanner(System.in).next();
		
		if (!"y".equalsIgnoreCase(answer)) {
			break;
		}
		
		}
	}
	public void showMenu(){
		System.out.println("欢迎进入《"+roomName+"》游戏房间");
		System.out.println("出拳规则： 1、剪刀   2、石头   3、布");
	}
	public void choiceRole(){
		System.out.println("对方角色: 1、路飞   2、索隆   3、娜美  4、乔巴");
		String[] nameArray ={"路飞","索隆","娜美","乔巴"};
		int choice = 0;
		do{
		System.out.println("请选择你的对手：");
		choice = new Scanner(System.in).nextInt();
		//可以加一个用户输入的验证
		}while(choice > 4 || choice < 1);
			
		
		player2.setName(nameArray[choice-1]);
		player1.setName("野原新之助");
		System.out.println(player1.getName() +"  VS  "+ player2.getName());
	}
	
	public int judge (int fist1,int fist2){
		if (fist1 == fist2) return 0;
		if (fist1 == 1 && fist2 == 2 || fist1 == 2 && fist2 == 3 || fist1 == 3 && fist2 ==1 ){
			player1.setScore(player1.getScore() +1);
			player2.setScore(player1.getScore() -1);
			return -1;	//玩家1胜利
		}else {
			player1.setScore(player1.getScore() -1);
			player2.setScore(player1.getScore() +1);
			return 1;
		}
		
		
	}
	
	public void endGame(){
		System.out.println(player1.getName() +"\t"+ player2.getName());
		System.out.println(player1.getScore() +"\t\t"+player2.getScore());
		System.out.println("游戏已经结束！");
	}
	
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	

	
	
	
	
	
}
