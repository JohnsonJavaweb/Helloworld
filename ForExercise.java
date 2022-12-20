public class ForExercise {
	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%9==0) {
				System.out.println("i="+i);
				count++;
				sum+=i;
			}
			
		}
		System.out.println("count="+count);
		System.out.println("sum="+sum);
		}
		
}