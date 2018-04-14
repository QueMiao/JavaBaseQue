package com.self.GuessDemo.javabase;
/**
 * 人类玩家
 * @author jyk
 *
 */
public class HumanPlayer {
	//属性：名称、分数、所出的拳、(角色对应的音效，角色的个性化台词)
	/** 静态常量：出拳类型的信息*/
	public static final int MessageTypeFist = 1;
	/** 静态常量：出拳赢的信息*/
	public static final int MessageTypeWin = 2;
	/** 静态常量：出拳输的信息*/
	public static final int MessageTypeLose = 3;
	private String name;
	private int score;
	private int fist;

	/** 出拳时所说的个性化台词 */
	private String [] fistWords = {
			"动感光波~",
			"大象大象~",
			"露PP外星人~",
			"姐姐你喜欢吃青椒嘛~",
			"平胸的欧巴桑~"
	};
		private String [] winWords = {
				"还有谁~~~~",
				"猜拳，有点意思",
				"超神~~~~",
				"全军出击",
				"吃着火锅唱着歌然后你就输了"
		};	
		private String [] loseWords = {
			"方才是我大意了~~",
			"再来再来~~",
			"我一定会回来的",
			"我不服~~啊~~",
			"再给我个机会吧"
		};
	//方法：设置得到名称、分数、(播放音效)、个性化台词、出拳
		/**
		 * 根据传入的消息类型，随机答应对应类型的消息
		 * msgType 对应HumanPlayer类中定义的静态常量
		 */
		public void sendMessage (int msgType){
			//生成一个 0-4之间的随机数字 
			int index = ((int) (Math.random()*1000)) % 5;
			String message =null;
			switch (msgType) {
			case MessageTypeFist:
				message =fistWords[index];
				break;
			case MessageTypeWin:
				message =winWords[index];
				break;
			case MessageTypeLose:
				message =loseWords[index];
				break;

			}
			System.out.println(message);
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public int getFist() {
			return fist;
		}
		public void setFist(int fist) {
			this.fist = fist;
		}
	
}