package chart05;

import java.util.Arrays;

/**
 * 質問６-１︓以下静的なメソッドを定義してください。
 * 1. メソッド名: megerArray
 *	2. 引数１︓intの配列 left
 * 3. 引数２︓intの配列 right
 * 4. 戻り値︓intの配列
 * 5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
 * @author user
 *
 */
public class Chart05_2 {

		public static int[] megerArray(int[] left, int[] right) {
		
			int[] c = new int[left.length + right.length];
			//int count = 0;
			for (int i = 0; i < left.length; i++) {
				c[i] = left[i];
				//count++;
			}
			for (int j = 0; j < right.length; j++) {
				c[left.length +j] = right[j];
			}
			
			return c ;
		}

		public static void main(String[] args) {
			int[] left = new int[] { 1, 2, 3, 4 };
			int[] right = new int[] { 5, 6, 7, 8 };
			int[] result = megerArray(left, right);
			System.out.println(Arrays.toString(result) );
		}
	}
