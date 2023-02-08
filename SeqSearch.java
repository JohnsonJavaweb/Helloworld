import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
	String arr[]= {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
	Scanner input=new Scanner(System.in);
	System.out.println("请输入名字");
	String name=input.next();
	int index=-1;//这里没想到
	for(int i=0;i<arr.length;i++) {
			if(name.equals(arr[i])) {
				System.out.println("数组里找到此名称,下标为"+i);
				index=i;//
				break;
//			}else {
//				System.out.println("找不到此名称"); 加了else以后，剩余三个都会显示一次
		}
		
		}
	if(index==-1) {
		System.out.println("没有找到");//
	}
	}
	
	
			
	}
	