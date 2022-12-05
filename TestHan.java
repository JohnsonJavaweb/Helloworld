public class TestHan {
    public static void main(String[] args) {
//		int x = 5;
//		int y = 6;
//		if(x++==6 & ++y==6) {//逻辑与
//			x = 11;
//		}
//		System.out.println("x="+x+"y="+y);
//    	int x = 5,y = 5;
//		if(x++==6 && ++y==6) {
//			x = 11;
//		}
//		System.out.println("x="+x+"y="+y);
//    	int x = 5,y = 5;
//		if(x++==5 | ++y==5) {
//			x = 11;
//		}
//		System.out.println("x="+x+"y="+y);
//    	int x = 5,y = 5;
//		if(x++==5 || ++y==5) {
//			x = 11;
//		}
//		System.out.println("x="+x+"y="+y);
    	boolean x = true;
    	boolean y = false;
    	short z = 46;
    	if((z++ == 6)&&(y = true)) z++;
    	if((x = false)||(++z==49)) z++;
    	System.out.println("z="+z);
	}
}
	