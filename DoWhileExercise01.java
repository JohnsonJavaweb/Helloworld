public class DoWhileExercise01 {
	public static void main(String[] args) {
		int i=1;
		int count=0;
		do {
			if(i%5==0 && i%3!=0) {
				System.out.println("i="+i);
				count++;//count++要放这，之前放外面错了，count=200
			}
			
			i++;
			
		}while(i<=200);
		
		System.out.println("count="+count);
		
	}
}