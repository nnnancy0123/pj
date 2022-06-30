package chart05;

import java.util.Arrays;

/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
    [2,9,6,7,4] ⇒ [2,4,6,7,9] 
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 * 
 * @author user
 *
 */
public class Chart05_5 {
	
	/**
	 * ソート処理
	 * @param array intの配列
	 * @return ソート済みの配列
	 */
	public static int[]  bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					// 入れ替え
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		return array;
	}
	
	
	public static void main(String[] args) {
		
		
		int[] array = new int[] {2,9,6,7,4};
		int[] res = bubbleSort(array);
		
		System.out.println(Arrays.toString(res));
	}

}
