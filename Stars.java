public class Stars{
	public static void main(String[] args) {
		int totallevel=10;
		for(int i=1;i<=totallevel;i++) {
			for(int k=1;k<=totallevel-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j == 1 || j==2*i-1 || i==totallevel) {
					System.out.print("*");
				} else {//其他情况输出空格
					System.out.print(" ");
				}
			//System.out.println("");放这就错了，应放下一行
		}
			System.out.println("");
		}
	}
}
			