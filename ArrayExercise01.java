public class ArrayExercise01{
	public static void main(String[] args) {
		char a[]=new char[26];
		for (int i=0;i<=25;i++) {
			a[i]=(char)('A'+i);
			System.out.println("第"+i+"个元素="+a[i]);
		}
	}
}