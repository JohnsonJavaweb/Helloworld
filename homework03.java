public class homework03 {
	public static void main(String[] args) {
		//char a1 = '飘';
		//char b1 = "西游记"; cannot covert from String to char
		//char c1 = a1 + b1;
		//System.out.println(c1);
		//编程，保存两本书名，用+拼接，看效果。保存两个性别，用+拼接，看效果。保存两本书的价格，用+拼接，看效果
		String book1 = "西游记";
		String book2 = "三国演义";
		System.out.println(book1 + book2);//西游记三国演义
		//性别应该用char保存，char的本质是整数
		char gender1 = '男';
		char gender2 = '女';
		System.out.println(gender1 + gender2);//得到男字符码值+女字符码值
		//保存两本书的价格
		double book3 = 12.34;
		double book4 = 15.43;
		System.out.println(book3 + book4);
	}
}