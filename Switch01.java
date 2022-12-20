import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符");
		char A = input.next().charAt(0);
		switch(A) {
			case 'a':
			System.out.println("今天是星期一");
			break;
			case 'b':
				System.out.println("今天是星期二");
				break;
			case 'c':
				System.out.println("今天是星期三");
				break;
			case 'd':
				System.out.println("今天是星期四");
				break;
			case 'e':
				System.out.println("今天是星期五");
				break;
			case 'f':
				System.out.println("今天是星期六");
				break;
			case 'g':
				System.out.println("今天是星期天");
				break;
			default:
				System.out.println("你输入的字符不正确，匹配不上");
		}
		
	}
}