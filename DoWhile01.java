public class DoWhile01{
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.print("你好，韩顺平教育"+i+"\n");
			i++;
		}while(i<=10);
		System.out.print("i="+i);
		int j=1;
		int sum=0;
		do {
			System.out.print("j="+j);
			sum+=j;
			j++;
			
		}while(j<=100);
		System.out.print("sum="+sum);
	}
}