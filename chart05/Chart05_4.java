package chart05;

import java.util.Arrays;

/**
 * 質問７︓以下静的なメソッドを定義してください。 1. メソッド名︓trim 2. 引数１︓charの配列 3. 戻り値︓charの配列 4.
 * 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
 * 
 * @author user
 *
 */
public class Chart05_4 {

	public static void main(String[] args) {
		char[] x = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		trim(x);
	}

	public static char[] trim(char[] c) {
		
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				startIndex = i;
				break;
			}
		}
		
		for (int j = c.length; j >= 0; j--) {
			if (c[j - 1] != ' ') {
				endIndex = j - 1;
				break;
			}
		}
		
		char[] res = new char[5];
		for(int k = 0; k < res.length; k++) {
			res[k] = c[startIndex +k];
		}
		System.out.println(Arrays.toString(res));
		
		return c;

	}
}
