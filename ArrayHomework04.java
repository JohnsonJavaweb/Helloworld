public class ArrayHomework04 {
	public static void main(String[] args) {
	int arr[]=new int[10];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(Math.random()*100)+1;
	}
	System.out.println("正序");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	
	}
	System.out.println("\n"+"倒序");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
	double sum=arr[0];
    int max=arr[0];
    int maxindex=0;
    for(int i=1;i<arr.length;i++) {
    	if(max<arr[i]) {
    		max=arr[i];
    		maxindex=i;
    		sum+=arr[i];
    	}
    	
    }
    System.out.println("max="+max+"maxindex="+maxindex);
    System.out.println("平均值="+sum/arr.length);
    int findnum=8;
    int index=-1;
    for(int i=0;i<arr.length;i++) {
    	if(findnum==arr[i]) {
    		System.out.println("找到"+findnum+"index="+i);
    		index=i;
    		break;
    	}
    	
    	}
    if(index==-1) {
		System.out.println("没有找到当前数");
    }
	}
}




