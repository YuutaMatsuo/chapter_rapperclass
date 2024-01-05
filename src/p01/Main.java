package p01;

public class Main {
	public static void main(String[] args) {
		// int型の変数に、int型の値を代入
		int a = 10;
		
		// Integer型の変数に、Integer型の値を代入
		Integer b = new Integer(10);
		
		// Integer型の変数に、int型の値を代入
		Integer c = 10;
		
		// 通常の自動型変換
		double d = 10;
		
		// ラッパークラスを基本データ型に代入する
		int e = b;
		int f = c;
		
		// 基本データ型にラッパークラスの値を代入する
		Integer g = new Integer(100);
//		int sample1 = g; // 内部的にint型に変換される
//		long sample2 = sample1;
		long h = g;
		
		// 代入できないケース
		int i = 100;
		Integer j = i;
//		Long k = j;
		
		String str = new String("こんにちは");
	}
}
