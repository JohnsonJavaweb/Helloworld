import java.util.Scanner;
public class MultiForExercise01 {
	public static void main(String[] args) {
		
		int passNum=0;
		
		Scanner input=new Scanner(System.in);
		double totalscore=0;
//		double sum=0;//sum放这一行，计算所有人人的总成绩，所有人的平均成绩
		for(int i=1;i<=3;i++) {
			double sum=0;//sum放这一行，表示一个班级的总分，计算每个班5人的总成绩，符合要求
			for(int j=1;j<=5;j++) {
				System.out.println("请输入第"+i+"个班第"+j+"个学生的成绩");
				double score=input.nextDouble();
				if(score>=60) {
					passNum++;
				}
				sum+=score;
//				totalscore+=sum;//放这是错的
			}
			
			System.out.println("sum="+sum+"\n"+"第"+i+"班的平均分为"+(sum/5));
			totalscore+=sum;//应放这一行，累积sum到totalscore
			
		}
		System.out.println("三个班的平均分为="+(totalscore/15));
		System.out.println("passNum="+passNum);
		}
}