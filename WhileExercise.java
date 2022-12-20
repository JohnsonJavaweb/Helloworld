public class WhileExercise {
	public static void main(String[] args) {
		int i=1;
		int count=0;
		while(i<=100) {
			if(i%3==0) {
				System.out.println("i="+i);
				count++;
			}
			i++;
		}
		System.out.println("count="+count);
		int j=40;
		while(j<=200) {
			if(j%2==0) {
				System.out.println("j="+j);
			}
			j++;
		}
	}
}