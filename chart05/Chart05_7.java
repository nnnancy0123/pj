package chart05;

/**
 * 類似処理を汎⽤化する為、メソッドを定義する
 * 
 * @author user
 *
 */
public class Chart05_7 {
	public static int summation(int x, int y) {
		int z = 0;
		z = x + y;
		return z;
	}

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3 };//new 一个值，带入新的数值
		int sum1 = 0;
		for (int i = 0; i < array1.length; ++i) {
			sum1 = sum1 + array1[i];
		}
		System.out.println("array1 = " + sum1);

		int[] array2 = new int[] { 5, 6, 7 };
		int sum2 = 0;
		for (int i = 0; i < array2.length; ++i) {
			sum2 = sum2 + array2[i];
		}
		System.out.println("array2 = " + sum2);
//总和の汎用化
		int j = 0;
		j = summation(sum1, sum2);
		System.out.println("summation = " + j);
	}
}
