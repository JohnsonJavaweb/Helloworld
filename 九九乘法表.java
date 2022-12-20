public class 九九乘法表{
		public static void main(String[] args) {	
		int sum=0; 
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
				System.out.print(i+"*"+j+"="+i*j+"\t");
				if(i==j) {
					System.out.println();
		}
			}
			}
		}
}