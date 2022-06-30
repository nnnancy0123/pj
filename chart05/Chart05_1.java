package chart05;

/**
 *  配列の和、MAX値、MIN値をまとめる関数化してください。
 */
public class Chart05_1 {

		//配列のmax値を求めるメソッド
		public static int max(int[] datas) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < datas.length; i++) {
				if (datas[i] > max) {
					max = datas[i];
				}
			}
			return max;
		}
		//配列のmin値を求めるメソッド
		public static int min(int[] datas) {
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < datas.length; i++) {
				if (datas[i] < min) {
					min = datas[i];
				}
			}
			return min;
		}
		public static void main(String[] args) {
			int[] array1 = { 1, 55, 73, 13 };
			int max = max(array1);
			int min = min(array1);
			System.out.println("最大值は" + max);
			System.out.println("最小值は" + min);
			
		}

	}
