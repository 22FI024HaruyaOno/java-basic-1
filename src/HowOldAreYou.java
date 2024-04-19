// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {
	public static void main(String[] args) { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。
            
			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			System.out.println("何歳ですか?");
            while(true) {
                String line = reader.readLine();
                if(line.equals("q") || line.equals("e") || line.equals("Q") || line.equals("Eq")) {
                    System.out.println("終了します");
                    break;
                }
                int age = Integer.parseInt(line);
                System.out.println("あなたは" + age + "歳ですね。");
                System.out.println("あなたは10年後、" + (age + 10) + "歳ですね。");
                if(age < 0) {
                    System.out.println("正しい年齢を入力してください");
                }
                else if(age < 6) {
                    if(age == 5) {
                        System.out.println("あなたは令和元年生まれですね。");
                    }
                    else {
                        System.out.println("あなたは令和" + (6-age) + "年生まれですね。");
                    }
                    
                }
                else if(age < 36) {
                    if(age == 35) {
                        System.out.println("あなたは平成元年生まれですね。");
                    }
                    else {
                        System.out.println("あなたは平成" + (36-age) + "年生まれですね。");
                    }
                }
                else if(age < 99){
                    if(age == 98) {
                        System.out.println("あなたは昭和元年生まれですね。");
                    }
                    else {
                        System.out.println("あなたは昭和" + (99-age) + "年生まれですね。");
                    }
                }
                else if(age < 113) {
                    if(age == 112) {
                        System.out.println("あなたは大正元年生まれですね。");
                    }
                    else {
                        System.out.println("あなたは大正" + (113-age) + "年生まれですね。");
                    }
                }
                else if(age < 157) {
                    if(age == 156) {
                        System.out.println("あなたは明治元年生まれですね。");
                    }
                    else {
                        System.out.println("あなたは明治" + (157-age) + "年生まれですね。");
                    }
                }
                else {
                    System.out.println("もしかして：人間じゃない");
                }
            }
		}
		catch(IOException e) {
			System.out.println(e);
		}


	}
}

//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

