import java.util.Scanner;//自己的方法，没有用equal,chance，注意if()&&和||用法的不同
public class BreakExercise02 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        for(int i=1;3-i>=0;i++){
			System.out.println("请输入用户名");
			String name=input.next();
			System.out.println("请输入密码");
			int password=input.nextInt();
			if (name=="丁真" || password==666) {
				System.out.println("登录成功");
				break;
			}else{
				int j=3-i;
				System.out.println("还有"+j+"次机会");
				
			}
		    }
		}	
		}