import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	do {
		int arrnew[]= new int[arr.length-1];
		for (int i=0;i<arr.length-1;i++) {
			arrnew[i]=arr[i];
	    }
		System.out.println("请输入你想缩减的元素");
		int addnum=input.nextInt();
		arr=arrnew;
		System.out.println("缩减后arr的元素情况为");
		for (int i=0;i<arrnew.length;i++) {
			System.out.print(arr[i]+"\t");
		    if(arrnew.length-1==0) {
		    	System.out.println("只剩下最后一个元素，不能再缩减");
		    }
		    }
		 System.out.println("添加成功，是否继续，y/n");
		    char key=input.next().charAt(0);
		    if(key=='n') {
		    	break;
	    }
	}while(true);
}
}
