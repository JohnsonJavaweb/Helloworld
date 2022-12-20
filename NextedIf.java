import java.util.Scanner;
public class NextedIf {
	public static void main(String[] args) {//没写这句话，没法执行程序
		Scanner input = new Scanner(System.in);
		System.out.println("请输入该歌手成绩");
		double score = input.nextDouble();
	if(score > 8.0) {
		System.out.println("请输入性别");
		char gender = input.next().charAt(0);
		if(gender=='男') {
			System.out.println("进入男子组");
		}else if(gender == '女'){
			System.out.println("进入女子组");
		}else {
			System.out.println("您的性别有误，不能进入决赛");
		}
	}else {
		System.out.println("淘汰");
	}
}
}
