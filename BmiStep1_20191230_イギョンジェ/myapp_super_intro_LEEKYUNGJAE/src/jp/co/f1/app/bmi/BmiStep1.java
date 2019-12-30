package jp.co.f1.app.bmi;

import java.util.Scanner;

public class BmiStep1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("※※BMI計算プログラムを開始します※※");
		System.out.println();
		System.out.print("身長(単位cm)を入力してください　>　");
		double height = sc.nextDouble();
		double mheight = height/100;

		System.out.print("体重(単位kg)を入力してください　>　");
		double weight = sc.nextDouble();

		double bmi = weight/(mheight*mheight);

		String msg = "";
		if(height<=0 || weight<=0) {
			msg = "※※0以下の数値があるため、再入力してください※※";
			System.out.println(msg);
			System.exit(0);
		}
		if(bmi>=25) {
			msg = "太り気味です。";
		} else if(bmi<18.5){
			msg = "やせ気味です。";
		}  else {
			msg = "正常値です。";
		}

		System.out.println("身長が　"+height+"cm, "+"体重が　"+weight+"kgの場合" );
		System.out.println("BMIの値は"+bmi+"です。");
		System.out.println(msg);
		System.out.println();
		System.out.println("※※BMI計算プログラムを終了します※※");
	}
}
