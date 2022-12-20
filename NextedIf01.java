import java.util.Scanner;
public class NextedIf01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入该歌手成绩");// 没写这句话，无法执行程序
		double score = input.nextDouble();
	if(score > 8.0) {
		System.out.println("请输入性别");
		char gender = input.next().charAt(0);
		if(gender=='男') {
			System.out.println("进入男子组");
		}else if(gender== '女') {
			System.out.println("进入女子组");
		}else {
			System.out.println("你的性别有误，不能参加决赛");
	}
		
	}else {
			System.out.println("sorry,你被淘汰了");
		
	}	
	}			
}

	
