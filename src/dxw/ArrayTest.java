package dxw;

public class ArrayTest {
	public static void main(String[] args) {
		//静态初始化第一个数组
		String[] books = new String[] {"疯狂java讲义","轻量级javaEE企业应用实战","疯狂Ajax讲义","疯狂XML讲义"};
		//静态初始化第二个数组
		String[] names = {"孙悟空","猪八戒","白骨精"};
		//动态初始化第三个数组
		String[] strArr = new String[5];
		System.out.println("books数组的长度为:"+books.length);
		System.out.println("names数组的长度为:"+names.length);
		System.out.println("strArr数组的长度为:"+strArr.length);
	}
}
