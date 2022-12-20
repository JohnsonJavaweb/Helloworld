import java.util.Scanner;
public class NextedIf02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = input.nextInt();
		if(month >= 4 && month <= 10) {
			System.out.println("请输入年龄");
			int age = input.nextInt();
			if(age >=18 && age<= 60) {
				System.out.println("旺季成人票价为60");
			}else if(age <18) {
				System.out.println("旺季儿童票价为半价30");
			}else if(age > 60) {
				System.out.println("旺季老人票价为1/3即20");
			}
		}else if(month < 4 || month > 10){
			System.out.println("请输入年龄");
			int age = input.nextInt();
			if(age >=18 && age<= 60) {
				System.out.println("淡季成人票价为40");
			}else {
				System.out.println("票价为20");
			}
		}
	}
}