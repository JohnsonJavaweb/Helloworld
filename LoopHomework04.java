public class LoopHomework04{
	public static void main(String[] args) {
		int count=0;//统计输出的个数
		for(int i=1;i<=100;i++) {
			if(i%5!=0) {
				System.out.print(i);
				count++;
				//判断，每满5个，就输出一个换行
				if(count%5==0) {
					System.out.println();
				}
			}
		}
	}
}