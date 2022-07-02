package chart05;

import java.util.Scanner;

/**
 * 戻り値あるメソッドはATMからお⾦を引き出す︓⾦額を⼊⼒して、お⾦を出す。 戻り値な いメソッドはATMに保存する︓お⾦を⼊⼒、返却しない。
 * 
 * @author user
 *
 */
public class Chart05_8 {
	public static int getMoneyFromATM(int amount) {// 引き出す︓⾦額を⼊⼒して、お⾦を出す
		return amount;
	}

	public static void saveMoneyToATM(int amount) {// 保存する︓お⾦を⼊⼒、返却しない
		// 返却値ない
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
		scan.close();
		
		num = getMoneyFromATM(num);
		System.out.println(num);
		}
	}

