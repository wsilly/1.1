package dxw;

public class ArrayTest2 {
	public static void main(String[] args) {
		//采用静态初始化方式初始化第一个数组
		String[] books = new String[] {"疯狂java讲义","轻量级javaEE企业应用实战","疯狂Ajax讲义","疯狂XML讲义"};
		//采用静态方式初始化第二个数组
		String[] names = {"孙悟空","猪八戒","白骨精"};
		//采用动态方式初始化第三个数组
		String[] strArr = new String[5];
		//把books数组变量和strArr数组变量指向names所引用的数组
		books = names;
		strArr = names;
		System.out.println("————————————————————");
		System.out.println("books数组的长度为："+ books.length);
		System.out.println("names数组的长度为："+names.length);
		System.out.println("strArr数组的长度为："+strArr.length);
		//改变books数组变量搜索引用的第二个元素
		books[1] = "唐曾";
		System.out.println("names数组的第二个元素为："+names[1]);
	}
}
