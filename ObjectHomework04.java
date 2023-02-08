public class ObjectHomework04 {
	public static void main(String[] args) {
		int arr[]= {13,45,34,100,43,53};
		A03 a=new A03();
		int arrnew1 []=a.copyArr(arr);//这里arrnew1没有先创建新数组，直接接收方法返回的数组
		for(int i=0;i<arrnew1.length;i++) {
			System.out.print(arrnew1[i]+" ");//显示数组也要用遍历方法，for循环，忘了
		}
		
	}
	}
class A03 {
	
    public int[] copyArr (int arr []) {
    	int arrnew []=new int [arr.length];
    	for(int i=0;i<arrnew.length;i++) {
    		arrnew[i]=arr[i];//复制数组，要用遍历方法，for循环，还记得
    		
    	}
    	return arrnew;
	}
    
}
			