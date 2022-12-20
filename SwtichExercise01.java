import java.util.Scanner;
public class SwtichExercise01 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = input.nextDouble();
		if(score >= 0 && score <= 100) {
			switch((int)(score/60)) {
			case 1:
				System.out.println("合格");
				break;
			case 0:
				System.out.println("不合格");
				break;
			}
		}else {
			System.out.println("输入的成绩有误，应在0-100之间");
		}
	}
	
}