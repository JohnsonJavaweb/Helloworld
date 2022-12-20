import java.util.Scanner;
public class BreakExercise01老师的方法 {
	public static void main(String[] args) {
		Scanner myScanner=new Scanner(System.in);
		String name= "";
		String password= "";
		int chance=3;//登录一次，就减少一次
		for (int i=1;i<=3;i++) {
			System.out.println("请输入名字");
			name=myScanner.next();
			System.out.println("请输入密码");
			password=myScanner.next();
			if("丁真".equals(name) &&"666".equals(password)) { //equal的用法，用于string的比较，第一次学
				System.out.println("恭喜你，登录成功");
				break;
			}
			chance--;//chance的用法，第一次学
			System.out.println("你还有"+chance+"次登录机会");
			
		}
		
			
    
	}
}