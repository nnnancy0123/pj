package chart05;

import java.util.Arrays;

/**
 * 質問６-２︓以下静的なメソッドを定義してください。 1. メソッド名: subArray 2. 引数１︓intの配列 array 3.
 * 引数２︓開始のstartIndex 4. 引数３︓⻑さlength 5. 戻り値︓intの配列 6.
 * 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する 
 * 以下メソッドの実施例︓ 
 * 1,int[] array =new int[] {1, 2, 3, 4}; 
 * 2, start = 1, length = 2
 * 3,int[] result = new int[]{2, 3}
 * 
 * @author user
 *
 */
public class Chart05_3 {
	public static int[] subArray(int[] array, int startIndex, int length) {
		//int[] Array = new int[length -1 + startIndex];
		int[] newArray = new int[length];
		for (int i = 0; i < length; i++) {
			newArray[i] = array[startIndex + i];
		}
		return newArray;
	}

	public static void main(String args[]) {
		int[] array = { 1, 2, 3, 4 };
		int startIndex = 1, length = 2;
		int[] res = subArray(array, startIndex, length);
		System.out.println("Array: " + Arrays.toString(res));

	}
}
