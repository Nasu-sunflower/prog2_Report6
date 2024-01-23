package main.jp.ac.uryukyu.ie.e225406;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int playHand;
    String input;
        
    Scanner scanner = new Scanner(System.in); // scannerをここで初期化

    GirlFrend girlfrend = new GirlFrend("あつこ", 100, false);

    System.out.printf("今日%sさんと出会った。素敵な人だ",girlfrend.getName());

    int turn = 0;
        while(  girlfrend.getMarriage() == false ){
            turn++;
            System.out.printf("出会って%d日目！\n今日はどうやってアピールしよう", turn);
            
            do {
                System.out.println("1:おしゃべりする 2:プレゼントを渡す 3:プロポーズする");
                input = scanner.next(); //コマンド画面から文字列の入力を読み取ります
                if (input.matches("[1-3]")) {//1~3の場合はtrue
                    playHand = Integer.parseInt(input); // 文字列の入力を整数型に置き換えて代入します
                    break; //ループを抜けます
                }
                System.out.println("該当する半角数字で入力してください");
            } while (true);

            if(playHand == 1){girlfrend.talk(girlfrend);}
            if(playHand == 2){girlfrend.doPresent(girlfrend);}
            if(playHand == 3){girlfrend.propose(girlfrend);}
        }
        System.out.printf("末永くお幸せに！\n%d日でで結婚までたどり着いた！",turn);
    }
}
