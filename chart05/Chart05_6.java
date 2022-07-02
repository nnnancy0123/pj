package chart05;

import java.util.Arrays;

/**
 * 質問９︓メソッドの呼び出す練習。
 *1. 質問６-１を⽤い、２つ配列をマージします。
 *2. 質問８を⽤い、ステップ１のマージした配列をソートする。
 *3. 注意︓コードを１⾏にしてください。
 * @author user
 *
 */
public class Chart05_6 {
	public static int[] megerArray(int[] left, int[] right) {

		int[] c = new int[left.length + right.length];
		// int count = 0;
		for (int i = 0; i < left.length; i++) {
			c[i] = left[i];
			// count++;
		}
		for (int j = 0; j < right.length; j++) {
			c[left.length + j] = right[j];
		}
		return c;
	}
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] left = {2, 4, 6, 54, 21};
		int[] right = {44, 52, 34, 61, 22};
		int[] result = megerArray(left,right);
		System.out.println(Arrays.toString(result));
		int[] res = bubbleSort(result);
		System.out.println(Arrays.toString(res));
	}
}
