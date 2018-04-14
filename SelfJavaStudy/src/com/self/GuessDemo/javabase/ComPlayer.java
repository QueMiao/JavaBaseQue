package com.self.GuessDemo.javabase;
/**
 * 人类玩家
 * @author jyk
 *
 */
public class ComPlayer {
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
			"问我们是敌是友？这种事，悉听尊便~~",
			"将过去和羁绊全部丢弃,不要吝惜那为了梦想流下的泪水。",
			"做喜欢的事才是最重要的！",
			"如果不豁出性命的话，也是无法开创未来的",
			"如果承受不起海上的盛名，就根本不配当海贼！"
	};
		private String [] winWords = {
				"我不会去统治这片大海，在这片大海上，最自由的人就是海贼王！",
				"我不是天生的王者 但我骨子里流动着不让我低头的血液",
				"我是要成为海贼王的男人!",
				"海贼王，我当定了!",
				"你要当哪里的王我都没意见，但海贼的王，有我一个就够了！"
		};	
		private String [] loseWords = {
			"如果死了就没有未来了。如果不拼命，同样无法开创未来。",
			"孤身一人比疼痛更痛苦！",
			"身为未来海贼王的伙伴，不要露出那种没出息的表情。",
			"不打败你，我就什么也守护不了！",
			"宁可两不相干，擦肩而过，这一生都没有交集。"
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
			//电脑的出拳实际上就是生成了1 -3之间的随机数字
			fist = ((int)(Math.random()* 30000)) % 3+1;
			return fist;
		}
//		public void setFist(int fist) {
//			this.fist = fist;
//		}
	
}