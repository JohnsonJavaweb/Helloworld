import java.util.Scanner;
public class ArrayHomework03 {
	public static void main(String[] args) {
	int arr[]= {10,12,45,90};
	int arr1[]=new int[arr.length+1];
	Scanner input=new Scanner(System.in);
	System.out.println("请输入元素值");
	int num=input.nextInt();
	if(num<10) {
		for(int i=1;i<arr1.length;i++) {
				arr1[i]=arr[i-1];	
			arr1[0]=num;
		}
		System.out.println("输入该元素后原数组为");
		for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i]+" "); 
		}
	}else if(num>10 && num<12) {
		for(int i=0;i<arr1.length;i++) {
			if(i==1) {
				arr1[i]=num;
			}else if(i==0){
				arr1[i]=arr[i];
			}else if(i>1) {
				arr1[i]=arr[i-1];
			}
		}
		System.out.println("输入该元素后原数组为");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}else if(num>12 && num<45) {
		for(int i=0;i<arr1.length;i++) {
			if(i<=1) {
				arr1[i]=arr[i];
			}else if(i==2) {
				arr1[i]=num;
			}else if(i>2) {
				arr1[i]=arr[i-1];
			}
		}
		System.out.println("输入该元素后原数组为");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
	}
	}else if(num>45 && num<90) {
		for(int i=0;i<arr1.length;i++) {
			if(i<=2) {
				arr1[i]=arr[i];
			}else if(i==3) {
				arr1[i]=num;
			}else if(i>3) {
				arr1[i]=arr[i-1];
			}
		}
		System.out.println("输入该元素后原数组为");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}else if(num>90) {
		for(int i=0;i<arr1.length;i++) {
			if(i<=3) {
				arr1[i]=arr[i];
			}else if(i==4) {
				arr1[i]=num;
			}
	}
		System.out.println("输入该元素后原数组为");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}else {
		System.out.print("输入数值错误，无法使原数组仍然为升序，请重新输入");
	}
	}
}