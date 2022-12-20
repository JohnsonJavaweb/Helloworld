import java.util.Scanner;
public class If01 {
	public static void main(String[] args) {
		//定义一个scanner对象
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量
		int age = input.nextInt();
		//使用if判断，输出对应信息
		if(age > 18) {
			System.out.println("你年龄大于18，应对自己行为负责");
			
		}
		System.out.println("程序继续");
	}
}