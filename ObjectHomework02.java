public class ObjectHomework02 {
	public static void main(String[] args) {
		String arr[]= {"名字","新年快乐", "兔年","韩老师","helloworld"};
		A02 a=new A02();
		int index=a.find("名字",arr);
		System.out.println ("查找的index="+index);
	}
	}
class A02{
	public int find(String e,String arr[]) {
		int res=0;
		for (int i=0;i<arr.length;i++) {
			if(e.equals(arr[i])) {
				return i;
			}
		}
		return -1; //老师的方法，没有用else,for循环找不到就返回-1。
	}
}
