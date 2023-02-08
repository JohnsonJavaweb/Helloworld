public class ObjectHomework03 {
	public static void main(String[] args) {
		Book b=new Book("天龙八部",1100);
		b.infor();
		b.updateprice();
		b.infor();
	}
	}
class Book{
	double price;
	String name;
	public Book(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public void updateprice(){
		// 如果方法中没有price局部变量，this.price等价于price
		if (this.price>150) {
			this.price=150;
		}else if(this.price >100 ) { //这里可以省略&& price <=150，因为第一行代码已经写了
			this.price=100;
		}
		
		}
	public void infor() {
		System.out.println("书名"+this.name+"价格="+this.price);
	}

}