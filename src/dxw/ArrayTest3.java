package dxw;

public class ArrayTest3 {
	public static void main(String[] args) {
		//定义并初始化numes数组
		int[] numes = new int[] {3,5,20,12};
		//定义一个prices数组变量
		int[] prices;
		//让prices数组指向numes数组所引用的数组对象
		prices = numes;
		for(int i = 0;i < prices.length;i++) {
			System.out.println(prices[i]);
		}
		//将prices数组的第三个元素赋值为34
		prices[2] = 34;
		//访问numes数组的三个元素，将看到输出为34
		System.out.println(prices[2]);
	}
}
