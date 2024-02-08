package jp.ac.uryukyu.ie.e225406;

/**
 * GirlFrendクラス
 * 攻略対象の女の子を作成するクラス
 */

public class GirlFrend {

    private String name;
    private int love;
    private boolean marriage;

    public GirlFrend(String name,int maximumlove,boolean marriage){
        this.name = name;
        love = maximumlove;
        marriage = false;
    }
    /**
     * GirlFrendは名前と愛パラメーターと結婚フラグをもつ
     */

    //getter
    public String getName(){return this.name;}
    public int getLove(){return this.love;}
    public boolean getMarriage(){return this.marriage;}

    public void doPresent(GirlFrend girlFrend){

        love -= 30;

        System.out.printf("%sさん、プレゼントです！\n", name);

        if (love < 0){
            System.out.printf("%s:あなたとずっと一緒にいたいわ。\n", name);
        }else{ 
            System.out.printf("%s:うれしいわ。\n", name);
        }
        /**
         * 指定された値loveを引いて、
         * 指定された文字列をプリント
         * love>0の場合分岐する。
         */
    }

    public void talk(GirlFrend girlFrend){

        love -= 20;

        System.out.printf("%sさん、おしゃべりしましょう！\n", name);

        if (love < 0){
            System.out.printf("%s:あなたとずっと一緒にいたいわ。\n", name);
        }else{ 
            System.out.printf("%s:たのしいわ。\n", name);
        }
        /**
         * 指定された値loveを引いて、
         * 指定された文字列をプリント
         * love>0の場合分岐する。
         */
    }

    public void propose(GirlFrend girlFrend){

        System.out.printf("僕と結婚してください！\n");
        
        if(love <= 0){
            System.out.printf("%s:よろこんで！\n", name);
            marriage = true;
        }else{
            System.out.printf("%s:あなたのことそういう風に見れないのごめんなさいね。\n", name);
        }
        /**
         * loveの値によって分岐
         * love>0の時結婚成功　marriage=true
         * love<0の時結婚失敗　
         */
    }
}
